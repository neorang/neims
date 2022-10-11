package com.neorang.neims.globals.mapper;

public class EnumValue {
    private final String code;
    private final String value;

    public EnumValue(EnumModel enumModel) {
        this.code = enumModel.getCode();
        this.value = enumModel.getValue();
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

}
