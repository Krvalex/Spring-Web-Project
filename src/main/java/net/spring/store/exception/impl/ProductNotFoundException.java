package net.spring.store.exception.impl;

import net.spring.store.exception.ElementNotFoundException;

public class ProductNotFoundException extends ElementNotFoundException {

    public ProductNotFoundException(String message) {
        super(message);
    }
}
