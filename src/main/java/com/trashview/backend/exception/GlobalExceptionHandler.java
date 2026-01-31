package com.trashview.backend.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
Catches exception globally
Maps exception → HTTP status
Keeps controllers clean
*/
@RestControllerAdvice
public class GlobalExceptionHandler {

    //Standard logger definition
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class.getName());


    @ExceptionHandler(TrashNotfoundException.class)
    public ResponseEntity<String> handleTrashNotfoundException(TrashNotfoundException e){
        log.warn("Trash not found: {}", e.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(e.getMessage());
    }
}
