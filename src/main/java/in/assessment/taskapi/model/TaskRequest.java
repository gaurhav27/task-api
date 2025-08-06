package in.assessment.taskapi.model;

import in.assessment.taskapi.enums.Status;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskRequest {

    private String title;
    private LocalDate dueDate;
    private Status status;

    public TaskRequest() {
    }

    public TaskRequest(String title, LocalDate dueDate, Status status) {
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
    }

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
}
