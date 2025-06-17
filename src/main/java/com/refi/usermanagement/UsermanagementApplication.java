package com.refi.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Main entry point for the Spring Boot application.
// The @SpringBootApplication annotation enables auto-configuration and component scanning.
@SpringBootApplication
public class UsermanagementApplication {

    // The main method starts the Spring Boot application.
    public static void main(String[] args) {
        SpringApplication.run(UsermanagementApplication.class, args);
    }

}