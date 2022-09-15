package com.neorang.neims.users;

public enum Role {
    Admin("ADMIN", "관리자"),
    User("USER", "일반사용자");

    private String roleCode;
    private String roleName;

    Role(String roleCode, String roleName) {
        this.roleCode = roleCode;
        this.roleName = roleName;
    }
}
