package com.example.spring_web_project.repositories;

import com.example.spring_web_project.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
