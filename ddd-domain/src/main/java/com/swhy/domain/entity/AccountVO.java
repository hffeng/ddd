package com.swhy.domain.entity;

import com.swhy.common.OrgAccountException;
import org.springframework.util.StringUtils;

public class AccountVO {
    private  String accountNo;

    public AccountVO(String accountNo){
        if (StringUtils.isEmpty(accountNo))
            throw new OrgAccountException("invalid account",1001);
        this.accountNo = accountNo;
    }
}
