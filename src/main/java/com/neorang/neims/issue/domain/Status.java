package com.neorang.neims.issue.domain;

import com.neorang.neims.globals.mapper.EnumModel;

public enum Status implements EnumModel {
    REQUEST("REQUEST", "요청");

    private String statusCode;
    private String statusName;
    private
    Status(String statusCode, String statusName) {
        this.statusCode = statusCode;
        this.statusName = statusName;
    }


    @Override
    public String getCode() {
        return statusCode;
    }

    @Override
    public String getValue() {
        return statusName;
    }
}
