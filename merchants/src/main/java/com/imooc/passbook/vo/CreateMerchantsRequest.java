package com.imooc.passbook.vo;

import com.imooc.passbook.constant.ErrorCode;
import com.imooc.passbook.dao.MerchantsDao;
import com.imooc.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Object of the request to create a merchant
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMerchantsRequest {

    // merchant name
    private String name;

    // merchant logo
    private String logoUrl;

    // merchant business license
    private String businessLicenseUrl;

    // merchant phone
    private String phone;

    // merchant address
    private String address;

    /**
     * validate request
     * @param merchantsDao {@link MerchantsDao}
     * @return {@link ErrorCode}
     */
    public ErrorCode validate(MerchantsDao merchantsDao) {
        if (merchantsDao.findByName(this.name) != null) {
            return ErrorCode.DUPLICATE_NAME;
        }
        if (this.logoUrl == null) {
            return ErrorCode.EMPTY_LOGO;
        }
        if (this.businessLicenseUrl == null) {
            return ErrorCode.EMPTY_BUSINESS_LICENSE;
        }
        if (this.address == null) {
            return ErrorCode.EMPTY_ADDRESS;
        }
        if (this.phone == null) {
            return ErrorCode.ERROR_PHONE;
        }
        return ErrorCode.SUCCESS;
    }


    /**
     * change Object to Merchants Object(save in MySQL)
     * @return {@link Merchants}
     */
    public Merchants toMerchants() {
        Merchants merchants = new Merchants();
        merchants.setName(name);
        merchants.setLogoUrl(logoUrl);
        merchants.setBusinessLicense(businessLicenseUrl);
        merchants.setPhone(phone);
        merchants.setAddress(address);
        return merchants;
    }
}
