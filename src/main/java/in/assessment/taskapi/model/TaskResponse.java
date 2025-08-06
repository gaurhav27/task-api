package in.assessment.taskapi.model;

import in.assessment.taskapi.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class TaskResponse {

    private Long id;
    private String title;
    private LocalDate dueDate;
    private String status;
    private String taskId;

    public TaskResponse(Long id, String title, LocalDate dueDate, Status status, String taskId) {
        this.id = id;
        this.taskId = taskId;
        this.title = title;
        this.dueDate = dueDate;
        this.status = status.name();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
