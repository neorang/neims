package com.neorang.neims.users.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class DuplicatedException extends RuntimeException {

    public DuplicatedException(String message) {
        super(message + " is Duplicated");
    }

}
