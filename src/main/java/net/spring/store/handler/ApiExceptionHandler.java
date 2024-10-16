package net.spring.store.handler;

import net.spring.store.exception.ErrorMessage;
import net.spring.store.exception.impl.ImageNotFoundException;
import net.spring.store.exception.impl.ProductNotFoundException;
import net.spring.store.exception.impl.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorMessage handleImageNotFoundException(ImageNotFoundException ex) {
        return new ErrorMessage(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                "Image Not Found",
                ex.getMessage());
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorMessage handleProductNotFoundException(ProductNotFoundException ex) {
        return new ErrorMessage(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                "Product Not Found",
                ex.getMessage());
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorMessage handleUserNotFoundException(UserNotFoundException ex) {
        return new ErrorMessage(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                "User Not Found",
                ex.getMessage());
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorMessage handleUsernameNotFoundException(UsernameNotFoundException ex) {
        return new ErrorMessage(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                "Username Not Found",
                ex.getMessage());
    }
}
