├── .gitattributes
├── .gitignore
├── .mvn
    └── wrapper
    │   └── maven-wrapper.properties
├── mvnw
├── mvnw.cmd
├── pom.xml
└── src
    ├── main
        ├── java
        │   └── in
        │   │   └── assessment
        │   │       └── taskapi
        │   │           ├── TaskapiApplication.java
        │   │           ├── controller
        │   │               └── TaskController.java
        │   │           ├── entity
        │   │               └── Task.java
        │   │           ├── enums
        │   │               └── Status.java
        │   │           ├── exception
        │   │               ├── GlobalExceptionHandler.java
        │   │               └── TaskNotFoundException.java
        │   │           ├── model
        │   │               ├── TaskRequest.java
        │   │               └── TaskResponse.java
        │   │           ├── repository
        │   │               └── TaskRepository.java
        │   │           └── service
        │   │               └── TaskService.java
        └── resources
        │   └── application.properties
    └── test
        └── java
            └── in
                └── assessment
                    └── taskapi
                        └── TaskapiApplicationTests.java
