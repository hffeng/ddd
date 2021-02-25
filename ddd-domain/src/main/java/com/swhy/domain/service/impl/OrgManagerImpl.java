package com.swhy.domain.service.impl;

import com.swhy.domain.entity.AccountVO;
import com.swhy.domain.repository.DddRepo;
import com.swhy.domain.service.OrgManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgManagerImpl implements OrgManager {

    @Autowired
    private DddRepo dddRepo;

    @Override
    public String register(AccountVO accountVO) {
        return "domain layer information";
    }

    @Override
    public List<Object> getList() {
        return dddRepo.findAccountList();
    }
}
