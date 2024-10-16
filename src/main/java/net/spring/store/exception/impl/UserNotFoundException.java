package net.spring.store.exception.impl;

import net.spring.store.exception.ElementNotFoundException;

public class UserNotFoundException extends ElementNotFoundException {

    public UserNotFoundException(String message) {
        super(message);
    }
}
