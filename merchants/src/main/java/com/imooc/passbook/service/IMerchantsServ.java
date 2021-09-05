package com.imooc.passbook.service;

import com.imooc.passbook.vo.CreateMerchantsRequest;
import com.imooc.passbook.vo.PassTemplate;
import com.imooc.passbook.vo.Response;

/**
 * define Merchants service Interface
 */
public interface IMerchantsServ {

    /**
     * create merchants service
     * @param request {@link CreateMerchantsRequest}
     * @return {@link Response}
     */
    Response createMerchants(CreateMerchantsRequest request);

    /**
     * build merchants by id
     * @param id merchant id
     * @return {@link Response}
     */
    Response buildMerchantsInfoById(Integer id);

    /**
     * launch pass
     * @param template {@link PassTemplate}
     * @return {@link Response}
     */
    Response dropPassTemplate(PassTemplate template);
}
