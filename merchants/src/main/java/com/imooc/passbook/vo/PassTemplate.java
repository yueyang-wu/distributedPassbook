package com.imooc.passbook.vo;

import com.imooc.passbook.constant.ErrorCode;
import com.imooc.passbook.dao.MerchantsDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Object of Pass
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplate {

    // merchants id
    private Integer id;

    // pass title
    private String title;

    // pass summary
    private String summary;

    // pass description
    private String desc;

    // max number of pass
    private long limit;

    // if pass has token
    private boolean hasToken; // token saves in Redis Set, get token from Redis

    // pass background color
    private Integer background;

    // pass start time
    private Date start;

    // pass expire time
    private Date end;

    /**
     * validate weather merchants exists
     * @param merchantsDao {@link MerchantsDao}
     * @return {@link ErrorCode}
     */
    public ErrorCode validate(MerchantsDao merchantsDao) {
        if (merchantsDao.findById(id) == null) {
            return ErrorCode.MERCHANTS_NOT_EXIST;
        }
        return ErrorCode.SUCCESS;
    }
}
