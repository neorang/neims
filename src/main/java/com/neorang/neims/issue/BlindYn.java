package com.neorang.neims.issue;

public enum BlindYn {

    Y("Y","Y"),
    N("N","N");

    private String blindYnCode;
    private String blindYnName;

    BlindYn(String blindYnCode, String blindYnName) {
        this.blindYnCode = blindYnCode;
        this.blindYnName = blindYnName;
    }
}
