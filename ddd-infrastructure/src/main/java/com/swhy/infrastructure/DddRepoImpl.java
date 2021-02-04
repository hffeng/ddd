package com.swhy.infrastructure;

import com.swhy.domain.repository.DddRepository;
import com.swhy.infrastructure.vo.AccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DddRepoImpl implements DddRepository {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public boolean saveAccount(String account) {
        return false;
    }

    @Override
    public List<Object> findAccountList() {
        List<AccountVO> voList = accountMapper.findAll();
        List<Object> resultList = new ArrayList<>();
        voList.stream().map(e->resultList.add(e));
        return resultList;
    }
}
