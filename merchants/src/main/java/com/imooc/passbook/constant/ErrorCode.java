package com.imooc.passbook.constant;


/**
 * Error Code Enumerate
 */
public enum ErrorCode {
    SUCCESS(0, ""),
    DUPLICATE_NAME(1, "duplicate merchant name"),
    EMPTY_LOGO(2, "empty merchant logo"),
    EMPTY_BUSINESS_LICENSE(2, "empty business license"),
    ERROR_PHONE(4, "invalid merchant phone"),
    EMPTY_ADDRESS(5, "empty merchant address"),
    MERCHANTS_NOT_EXIST(6, "merchant not exists");

    // error code
    private Integer code;
    // error description
    private String desc;

    ErrorCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }
}
