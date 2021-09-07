package com.imooc.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * general response Object
 * 商户在平台执行HTTP请求，返回请求的响应
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    // error code, return 0 if correct
    private Integer errorCode = 0;

    // error message, return empty string if correct
    private String errorMsg = " ";

    // response Object
    private Object data;


    /**
     * correct Response Object
     * @param data Response Object
     */
    public Response(Object data) {
        this.data = data;
    }
}
