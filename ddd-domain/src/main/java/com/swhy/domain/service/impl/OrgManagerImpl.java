package com.swhy.domain.service.impl;

import com.swhy.domain.entity.AccountVO;
import com.swhy.domain.repository.DddRepository;
import com.swhy.domain.service.OrgManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrgManagerImpl implements OrgManager {

    @Resource
    private DddRepository dddRepository;

    @Override
    public String register(AccountVO accountVO) {
        return "domain layer information";
    }

    @Override
    public List<Object> getList() {
        return dddRepository.findAccountList();
    }
}
