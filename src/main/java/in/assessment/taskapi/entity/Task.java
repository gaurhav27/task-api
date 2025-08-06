package in.assessment.taskapi.entity;

import in.assessment.taskapi.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String taskId;
    private String title;
    private LocalDate dueDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Task() {
    }

    public Task(Long id, String title, LocalDate dueDate, Status status) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public LocalDate getDueDate() {
//        return dueDate;
//    }
//
//    public void setDueDate(LocalDate dueDate) {
//        this.dueDate = dueDate;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public String getTaskId() {
//        return taskId;
//    }
//
//    public void setTaskId(String taskId) {
//        this.taskId = taskId;
//    }
}
