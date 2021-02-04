package com.swhy.application.dto;

import com.swhy.domain.entity.AccountVO;

public class AccountDTO {

    private String accountNo;

    public AccountDTO(String accountNo){
        this.accountNo = accountNo;
    }


    public  AccountVO toAccountVO(){
        return new AccountVO(accountNo);
    }

}
