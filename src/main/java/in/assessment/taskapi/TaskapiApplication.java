package in.assessment.taskapi;

import in.assessment.taskapi.exception.TaskNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ExceptionHandler;

@SpringBootApplication
public class TaskapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskapiApplication.class, args);
	}

}
