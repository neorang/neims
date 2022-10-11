package com.neorang.neims.issue.domain;

public enum Priority {
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
}

