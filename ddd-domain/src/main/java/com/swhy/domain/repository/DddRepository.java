package com.swhy.domain.repository;

import java.util.List;

public interface DddRepository {

    boolean saveAccount(String account);

    List<Object> findAccountList();
}
