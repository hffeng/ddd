package com.swhy.domain.service;

import com.swhy.domain.entity.AccountVO;

import java.util.List;

public interface OrgManager {

    String register(AccountVO accountVO);

    List<Object> getList();
}
