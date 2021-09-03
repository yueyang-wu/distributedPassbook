package com.imooc.passbook.constant;

/**
 * background color of the coupon
 */
public enum TemplateColor {
    RED(1, "red"),
    GREEN(2, "green"),
    BLUE(3, "blue");

    // color code
    private Integer code;

    // color description
    private String color;

    TemplateColor(Integer code, String color) {
        this.code = code;
        this.color = color;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getColor() {
        return this.color;
    }
}
