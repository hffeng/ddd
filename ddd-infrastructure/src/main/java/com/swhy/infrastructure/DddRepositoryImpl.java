package com.swhy.infrastructure;

import com.swhy.domain.repository.DddRepo;
import com.swhy.infrastructure.vo.AccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DddRepositoryImpl implements DddRepo {

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
        for (AccountVO vo: voList){
            resultList.add(vo);
        }
        return resultList;
    }
}
