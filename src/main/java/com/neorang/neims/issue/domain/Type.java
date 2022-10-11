package com.neorang.neims.issue.domain;

import com.neorang.neims.globals.mapper.EnumModel;

public enum Type implements EnumModel {
    BUG("BUG", "버그"),
    SUBTASK("SUBTASK", "SUBTASK");

    private String typeCode;
    private String typeName;

    Type(String typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }


    @Override
    public String getCode() {
        return typeCode;
    }

    @Override
    public String getValue() {
        return typeName;
    }
}
