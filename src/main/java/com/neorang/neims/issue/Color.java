package com.neorang.neims.issue;

public enum Color {

    BLACK("BLACK","BLACK"),
    RED("RED","RED");


    private String colorCode;
    private String colorName;

    Color(String colorCode, String colorName) {
        this.colorCode = colorCode;
        this.colorName = colorName;
    }
}
