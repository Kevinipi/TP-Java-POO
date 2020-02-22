package com.ipiecoles.java.audio.security;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

import javax.persistence.EntityNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

/*Error 404 Exception*/
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleEntityNotFoundException (
            EntityNotFoundException entityNotFoundException){
     return entityNotFoundException.getMessage();
    }

/* Error 400 Exception*/
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleIllegalArgumentException (
            IllegalArgumentException illegalArgumentException){
        return illegalArgumentException.getMessage();
    }

/* Error  Exception*/
    @ExceptionHandler (DataIntegrityViolationException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public String dataError (
            DataIntegrityViolationException dataIntegrityViolationException) {
                return dataIntegrityViolationException.getMessage();
    }

}
