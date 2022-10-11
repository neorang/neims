package com.neorang.neims.users.domain;

import com.neorang.neims.globals.mapper.EnumModel;

public enum Role implements EnumModel {
    ADMIN("ADMIN", "관리자"),
    USER("USER", "일반사용자");

    private String roleCode;
    private String roleName;

    Role(String roleCode, String roleName) {
        this.roleCode = roleCode;
        this.roleName = roleName;
    }


    @Override
    public String getCode() {
        return roleCode;
    }

    @Override
    public String getValue() {
        return roleName;
    }
}
