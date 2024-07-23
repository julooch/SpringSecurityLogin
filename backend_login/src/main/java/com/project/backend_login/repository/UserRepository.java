package com.project.backend_login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.backend_login.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    
    Optional<User> findByEmail(String email);
}
