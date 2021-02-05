package com.swhy.application;

import com.swhy.application.dto.AccountDTO;
import com.swhy.domain.entity.AccountVO;
import com.swhy.domain.service.OrgManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountManager {
    private final static Logger logger = LoggerFactory.getLogger(AccountManager.class);

    @Autowired
    private OrgManager orgManager;

    public String getAccountInfo(AccountDTO accountDTO) {
        AccountVO avo = accountDTO.toAccountVO();
        return orgManager.register(avo);
    }

    public List<Object> getInfoList(){
        return orgManager.getList();
    }


}
