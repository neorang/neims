package com.neorang.neims.issue;

public enum Status {
    REQUEST("REQUEST", "요청");

    private String statusCode;
    private String statusName;
    private
    Status(String statusCode, String statusName) {
        this.statusCode = statusCode;
        this.statusName = statusName;
    }
}
