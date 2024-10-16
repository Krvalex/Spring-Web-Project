package net.spring.store.controllers;

import lombok.RequiredArgsConstructor;
import net.spring.store.models.Image;
import net.spring.store.services.ImageService;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class ImageController {
    private final ImageService imageService;

    @GetMapping("/images/{id}")
    private ResponseEntity<?> getImageById(@PathVariable Long id) {
        Image image = imageService.getById(id);
        InputStreamResource body = null;

        try (var stream = new ByteArrayInputStream(image.getBytes())) {
            body = new InputStreamResource(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok()
                .header("fileName", image.getOriginalFileName())
                .contentType(MediaType.valueOf(image.getContentType()))
                .contentLength(image.getSize())
                .body(body);
    }
}
