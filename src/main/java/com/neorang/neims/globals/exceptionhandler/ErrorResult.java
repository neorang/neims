package com.neorang.neims.globals.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResult {
    private String errorType;
    private String errorMsg;
}
