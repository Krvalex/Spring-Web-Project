package net.spring.store.exception;

public class ElementNotFoundException extends RuntimeException {

    public ElementNotFoundException(String message) {
        super(message);
    }
}
