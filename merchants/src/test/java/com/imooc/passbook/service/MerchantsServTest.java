package com.imooc.passbook.service;

import com.alibaba.fastjson.JSON;
import com.imooc.passbook.vo.CreateMerchantsRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Merchants Service tests
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class MerchantsServTest {
    @Autowired
    private IMerchantsServ merchantsServ;

    @Test
//    @Transactional
    public void testCreateMerchantServ() {
        CreateMerchantsRequest request = new CreateMerchantsRequest();
        request.setName("merchant1");
        request.setLogoUrl("testLogo.com");
        request.setBusinessLicenseUrl("testLicense.com");
        request.setPhone("1234567890");
        request.setAddress("San Jose");

        System.out.println(JSON.toJSONString(merchantsServ.createMerchants(request)));
    }
}
