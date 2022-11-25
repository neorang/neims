package com.neorang.neims.globals.exceptionhandler;

import com.neorang.neims.users.exception.DuplicatedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class CustomExceptionHandler {

    ErrorResult getErrorResult(String errorCd, String msg) {
        return new ErrorResult(errorCd, msg);
    }

    @ExceptionHandler(DuplicatedException.class)
    protected ResponseEntity<ErrorResult> handleCustomException(DuplicatedException e) {
        ErrorResult errorResult = getErrorResult("BAD_REQUEST", e.getMessage());
        return new ResponseEntity<>(errorResult, HttpStatus.BAD_REQUEST);
    }
}
