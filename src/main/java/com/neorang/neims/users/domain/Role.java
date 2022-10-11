package com.neorang.neims.users.domain;

public enum Role {
    ADMIN("ADMIN", "관리자"),
    USER("USER", "일반사용자");

    private String roleCode;
    private String roleName;

    Role(String roleCode, String roleName) {
        this.roleCode = roleCode;
        this.roleName = roleName;
    }
}
