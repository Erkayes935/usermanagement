# User Management Spring Boot Project

## Overview
This project is a simple User Management REST API built with Spring Boot. It allows you to create, read, update, and delete user data, as well as search users by email or username. The project demonstrates a clean separation of concerns using the standard Spring Boot architecture: Controller, Service, Repository, and Domain Model.

## Project Structure
- **Domain**: Contains the `User` entity, which represents the user data model.
- **Repository**: Contains the `UserRepository` interface, which handles database operations using Spring Data JPA.
- **Service**: Contains the `UserService` class, which implements business logic and interacts with the repository.
- **Controller**: Contains the `UserController` class, which exposes REST endpoints for user operations.

## How to Run
1. Make sure you have Java and Maven installed.
2. Clone or download this project.
3. Run `mvnw spring-boot:run` or use your IDE to start the application.
4. The API will be available at `http://localhost:8080/users`.

## Endpoints
- `POST /users` - Create a new user
- `GET /users` - Get all users
- `GET /users/{id}` - Get user by ID
- `GET /users/email/{email}` - Get user by email
- `PUT /users/{id}` - Update user by ID
- `DELETE /users/{id}` - Delete user by ID
- `DELETE /users/email/{email}` - Delete user by email
- `DELETE /users/username/{username}` - Delete user by username

## Author Statement
This is an original project created by me as the author. I affirm that this work is entirely my own and has not been forked, adapted, or recreated from any open source projects or existing codebases. I take pride in delivering authentic and original work.

Enjoy exploring the code and feel free to reach out if you have any questions!
