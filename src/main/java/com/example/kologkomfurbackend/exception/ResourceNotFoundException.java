package com.example.kologkomfurbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class ResourceNotFoundException  extends RuntimeException{

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
