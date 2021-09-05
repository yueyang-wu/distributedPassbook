package com.imooc.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * create merchants response Object
 * assign merchants an id when successfully create a merchant in the system
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsResponse {
    // merchant id
    // if failed to create a merchant, return -1
    private Integer id;
}
