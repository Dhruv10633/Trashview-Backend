package com.trashview.backend.exception;

public class TrashNotfoundException extends RuntimeException{

    public TrashNotfoundException(String message){
        super(message);
    }
}
