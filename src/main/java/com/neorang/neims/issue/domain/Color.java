package com.neorang.neims.issue.domain;

import com.neorang.neims.globals.mapper.EnumModel;

public enum Color implements EnumModel {

    BLACK("BLACK","BLACK"),
    RED("RED","RED");


    private String colorCode;
    private String colorName;

    Color(String colorCode, String colorName) {
        this.colorCode = colorCode;
        this.colorName = colorName;
    }


    @Override
    public String getCode() {
        return colorCode;
    }

    @Override
    public String getValue() {
        return colorName;
    }
}
