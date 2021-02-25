package com.swhy.domain.repository;

import java.util.List;

public interface DddRepo {

    boolean saveAccount(String account);

    List<Object> findAccountList();
}
