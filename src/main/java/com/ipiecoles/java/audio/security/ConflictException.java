package com.ipiecoles.java.audio.security;


import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ConflictException extends Exception {
    public ConflictException(String message) {
        super(message);
    }
}

