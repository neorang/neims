package com.neorang.neims.issue.domain;

import com.neorang.neims.globals.mapper.EnumModel;

public enum BlindYn implements EnumModel {

    Y("Y","Y"),
    N("N","N");

    private String blindYnCode;
    private String blindYnName;

    BlindYn(String blindYnCode, String blindYnName) {
        this.blindYnCode = blindYnCode;
        this.blindYnName = blindYnName;
    }

    @Override
    public String getCode() {
        return blindYnCode;
    }

    @Override
    public String getValue() {
        return blindYnName;
    }
}
