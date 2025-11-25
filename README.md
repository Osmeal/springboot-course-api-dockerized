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

---

## Running the Application Without Docker

Linux

```
./mvnw spring-boot:run
```

or Windows

```
mvn spring-boot:run
```

---

## Database Configuration

The application can run locally or inside Docker, so the database URL changes depending on the environment.


Local run example (no Docker):
```
spring.datasource.url=jdbc:postgresql://localhost:5432/course_api
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

Docker example (API + PostgreSQL inside Docker):
```
spring.datasource.url=jdbc:postgresql://postgres:5432/course_api
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

---

## Project Structure

project-root/
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



---

## Demo

A short video is included showing how the API is used via **Postman** (Vídeo API Java.mp4).

---

## API Endpoints

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


---
