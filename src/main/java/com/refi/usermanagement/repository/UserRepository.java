package com.refi.usermanagement.repository;

import com.refi.usermanagement.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Repository interface for User entity.
// Extends JpaRepository to provide CRUD operations and custom queries.
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Find a user by email address.
    Optional<User> findByEmail(String email);

    // Find a user by username.
    Optional<User> findByUsername(String username);

    // Check if a user exists by email.
    boolean existsByEmail(String email);

    // Delete a user by email.
    void deleteByEmail(String email);

    // Delete a user by username.
    void deleteByUsername(String username);
}
