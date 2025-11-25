# Spring Boot Course API with Docker & PostgreSQL

This project is a **RESTful API built with Spring Boot**, containerized using **Docker**, and connected to a **PostgreSQL** database running in a dedicated Docker container.
It is designed as a clean, professional, and production-ready example of a Spring Boot service with persistent storage.

---

## Features

* Java Spring Boot REST API
* PostgreSQL database running in Docker
* Separate containers for **API** and **database**
* Clear and modular project structure
* Simple CRUD operations for managing *Topics* *Courses* *Lessons* and *Users*
* Configurable via `application.properties`
* Reproducible environment using Docker and Docker Compose

---

## Technologies Used

* **Java 17+**
* **Spring Boot**
* **Spring Data JPA**
* **Hibernate**
* **PostgreSQL**
* **Docker & Docker Compose**
* **Maven**

---

## Docker Setup

Start all containers:

```
docker-compose up --build
```

Stop containers:

```
docker-compose down
```

<img width="1920" height="1005" alt="image" src="https://github.com/user-attachments/assets/33c35cb5-12fa-42e4-b8da-c91ed9de83b8" />

---

## Running the Application Without Docker

Linux/macOS

```
./mvnw spring-boot:run
```

Windows

```
mvn spring-boot:run
```

---

## Database Configuration

The application can be executed either locally or entirely through Docker.
Therefore, the database URL changes depending on the environment.


Local environment (no Docker):
```
spring.datasource.url=jdbc:postgresql://localhost:5432/course_api
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

Docker environment (API + PostgreSQL running in containers):
```
spring.datasource.url=jdbc:postgresql://postgres:5432/course_api
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

---

## Project Structure

```
springboot-course-api-dockerized/
├── src/
│   └── main/
│       ├── resources/
│       │   └── application.properties
│       └── java/
│           └── io/javabrains/
│               ├── CourseApiDataApplication.java
│               └── springbootstarter/
│                   ├── course/
│                   │   ├── Course.java
│                   │   ├── CourseController.java
│                   │   ├── CourseRepository.java
│                   │   └── CourseService.java
│                   ├── lesson/
│                   │   ├── Lesson.java
│                   │   ├── LessonController.java
│                   │   ├── LessonRepository.java
│                   │   └── LessonService.java
│                   ├── topic/
│                   │   ├── Topic.java
│                   │   ├── TopicController.java
│                   │   ├── TopicRepository.java
│                   │   └── TopicService.java
│                   └── users/
│                       ├── Users.java
│                       ├── UsersController.java
│                       ├── UsersRepository.java
│                       └── UsersService.java
├── docker/
│   ├── Dockerfile
│   └── docker-compose.yml
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

## Demo

A demo video (Video API Java.mp4) is included in the repository showing how to use the API via Postman.

---

## API Endpoints

## Topics

### Get all topics

`GET /topics`

### Get a topic by ID

`GET /topics/{id}`

### Create a new topic

`POST /topic`

### Update an existing topic

`PUT /topic/{id}`

### Delete a topic

`DELETE /topic/{id}`

---

## Courses

### Get all courses

`GET /topic/{topicId}/courses`

### Get a course by ID

`GET /topic/{topicId}/course/{id}`

### Create a new course

`POST /topic/{topicId}/course`

### Update an existing course

`PUT /topic/{topicId}/course/{id}`

### Delete a course

`DELETE /topic/{topicId}/course/{id}`

---

## Lessons

### Get all lessons

`GET /topic/{topicId}/course/{courseId}/lessons`

### Get a lesson by ID

`GET /topic/{topicId}/course/{courseId}/lesson/{id}`

### Create a new lesson

`POST /topic/{topicId}/course/{courseId}/lesson`

### Update an existing lesson

`PUT /topic/{topicId}/course/{courseId}/lesson/{id}`

### Delete a lesson

`DELETE /topic/{topicId}/course/{courseId}/lesson/{id}`

---

## Users

### Get all users

`GET /users`

### Get a user by ID

`GET /users/{id}`

### Create a new user

`POST /users`

### Update an existing user

`PUT /users/{id}`

### Delete a user

`DELETE /users/{id}`
