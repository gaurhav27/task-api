package in.assessment.taskapi.service;

import in.assessment.taskapi.repository.TaskRepository;
import in.assessment.taskapi.entity.Task;
import in.assessment.taskapi.exception.TaskNotFoundException;
import in.assessment.taskapi.model.TaskRequest;
import in.assessment.taskapi.model.TaskResponse;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskResponse createTask(TaskRequest taskRequest) {
        Task task = new Task();
        task.setTitle(taskRequest.getTitle());
        task.setDueDate(taskRequest.getDueDate());
        task.setStatus(taskRequest.getStatus());
        task.setTaskId(UUID.randomUUID().toString().substring(0,6));

        taskRepository.save(task);

        return new TaskResponse(
                task.getId(),
                task.getTitle(),
                task.getDueDate(),
                task.getStatus(),
                task.getTaskId()
                );
    }

    public List<TaskResponse> getAllTasks() {
        List<TaskResponse> tasks = taskRepository.findAll().stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .map(task -> new TaskResponse(
                        task.getId(),
                        task.getTitle(),
                        task.getDueDate(),
                        task.getStatus(),
                        task.getTaskId()
                ))
                .toList();
        if (tasks.isEmpty()) {
            throw new TaskNotFoundException("No Tasks Found!");
        }
        return tasks;
    }

    public TaskResponse getTaskById(Long id) {
        return taskRepository.findById(id)
                .map(task -> new TaskResponse(
                        task.getId(),
                        task.getTitle(),
                        task.getDueDate(),
                        task.getStatus(),
                        task.getTaskId()
                ))
                .orElseThrow(() -> new TaskNotFoundException("Task with id " + id + " not found"));
    }

    public List<TaskResponse> getTasksByStatus(String status) {
        List<TaskResponse> tasks = taskRepository.findByStatus(status).stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .map(task -> new TaskResponse(
                        task.getId(),
                        task.getTitle(),
                        task.getDueDate(),
                        task.getStatus(),
                        task.getTaskId()
                ))
                .toList();
        if (tasks.isEmpty()) {
            throw new TaskNotFoundException("No Tasks Found with status: " + status);
        }
        return tasks;
    }
}
