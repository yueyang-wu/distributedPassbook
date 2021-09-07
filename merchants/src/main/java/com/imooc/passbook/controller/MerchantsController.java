package com.imooc.passbook.controller;

import com.alibaba.fastjson.JSON;
import com.imooc.passbook.service.IMerchantsServ;
import com.imooc.passbook.vo.CreateMerchantsRequest;
import com.imooc.passbook.vo.PassTemplate;
import com.imooc.passbook.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * merchants service controller
 */
@Slf4j // for log
@RestController
@RequestMapping("/merchants") // uri - uniform resource identifier
public class MerchantsController {
    // merchants service interface
    private final IMerchantsServ merchantsServ;

    @Autowired
    public MerchantsController(IMerchantsServ merchantsServ) {
        this.merchantsServ = merchantsServ;
    }

    @ResponseBody
    @PostMapping("/create")
    public Response createMerchants(@RequestBody CreateMerchantsRequest request) {
        log.info("CreateMerchants: {}", JSON.toJSONString(request));
        return merchantsServ.createMerchants(request);
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Response buildMerchantsInfo(@PathVariable Integer id) {
        log.info("BuildMerchantsInfo: {}", id);
        return merchantsServ.buildMerchantsInfoById(id);
    }

    @ResponseBody
    @PostMapping("/drop")
    public Response dropPassTemplate(@RequestBody PassTemplate passTemplate) {
        log.info("DropPassTemplate: {}", passTemplate);
        return merchantsServ.dropPassTemplate(passTemplate);
    }
}
