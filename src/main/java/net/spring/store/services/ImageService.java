package net.spring.store.services;

import lombok.RequiredArgsConstructor;
import net.spring.store.exception.impl.ImageNotFoundException;
import net.spring.store.models.Image;
import net.spring.store.repositories.ImageRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ImageService {
    private final ImageRepository imageRepository;

    public Image getById(Long id) {
        return imageRepository.findById(id)
                .orElseThrow(() -> new ImageNotFoundException("No photo with this id - %s was found".formatted(id)));
    }
}
