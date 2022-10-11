package com.neorang.neims.issue.domain;

public enum Type {
    BUG("BUG", "버그"),
    SUBTASK("SUBTASK", "SUBTASK");

    private String typeCode;
    private String typeName;

    Type(String typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }
}
