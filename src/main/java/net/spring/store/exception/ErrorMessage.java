package net.spring.store.exception;

import java.util.Date;

public record ErrorMessage(int statusCode,
                           Date timestamp,
                           String message,
                           String description) {
}
