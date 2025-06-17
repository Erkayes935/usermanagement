package com.refi.usermanagement.service;

import com.refi.usermanagement.domain.User;
import com.refi.usermanagement.repository.UserRepository;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Service class that contains business logic for user management.
@Service
public class UserService {

    // Injects the UserRepository dependency.
    private final UserRepository userRepository;

    // Constructor-based dependency injection for UserRepository.
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create a new user and save to the database.
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Retrieve all users from the database.
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Retrieve a user by their ID.
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Retrieve a user by their email address.
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Update an existing user's information by ID.
    public User updateUser(Long id, User updatedUser) {
        return userRepository.findById(id)
                .map(existingUser -> {
                    existingUser.setUsername(updatedUser.getUsername());
                    existingUser.setEmail(updatedUser.getEmail());
                    existingUser.setPassword(updatedUser.getPassword());
                    return userRepository.save(existingUser);
                })
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    // Delete a user by their ID.
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    // Delete a user by their email address.
    @Transactional
    public void deleteUserByEmail(String email) {
        userRepository.deleteByEmail(email);
    }

    // Delete a user by their username.
    @Transactional
    public void deleteUserByUsername(String username) {
        userRepository.deleteByUsername(username);
    }

    // Check if an email already exists in the database.
    public boolean emailExists(String email) {
        return userRepository.existsByEmail(email);
    }
}
