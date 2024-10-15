package com.example.spring_web_project.repositories;

import com.example.spring_web_project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    abstract User findByEmail(String email);
}
