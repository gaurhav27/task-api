package in.assessment.taskapi.controller;

import in.assessment.taskapi.entity.Task;
import in.assessment.taskapi.model.TaskRequest;
import in.assessment.taskapi.model.TaskResponse;
import in.assessment.taskapi.service.TaskService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/createTask")
    public ResponseEntity<TaskResponse> createTask(@RequestBody TaskRequest taskRequest) {
       return ResponseEntity.ok(taskService.createTask(taskRequest));
    }

    @GetMapping("/getAllTasks")
    public ResponseEntity<List<TaskResponse>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @GetMapping("/getTaskById/{id}")
    public ResponseEntity<TaskResponse> getTaskById(@PathVariable Long id) {
        TaskResponse taskResponse = taskService.getTaskById(id);
        if (taskResponse == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(taskResponse);
    }

    @GetMapping("/getTasksByStatus/{status}")
    public ResponseEntity<List<TaskResponse>> getTasksByStatus(@PathVariable String status) {
        return ResponseEntity.ok(taskService.getTasksByStatus(status));
    }
}
