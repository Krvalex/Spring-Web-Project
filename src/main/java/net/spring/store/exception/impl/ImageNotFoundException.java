package net.spring.store.exception.impl;

import net.spring.store.exception.ElementNotFoundException;

public class ImageNotFoundException extends ElementNotFoundException {

    public ImageNotFoundException(String message) {
        super(message);
    }
}
