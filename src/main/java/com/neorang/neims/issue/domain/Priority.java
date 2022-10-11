package com.neorang.neims.issue.domain;

import com.neorang.neims.globals.mapper.EnumModel;

public enum Priority implements EnumModel {
    BLOCKER("BLOCKER", "BLOCKER"),
    CRITICAL("CRITICAL", "CRITICAL"),
    HIGH("HIGH", "HIGH"),
    MEDIUM("MEDIUM", "MEDIUM"),
    LOW("LOW", "LOW"),
    MINOR("MINOR", "MINOR");

    private String priorityCode;
    private String priorityName;

    Priority(String priorityCode, String priorityName) {
        this.priorityCode = priorityCode;
        this.priorityName = priorityName;
    }


    @Override
    public String getCode() {
        return priorityCode;
    }

    @Override
    public String getValue() {
        return priorityName;
    }
}

