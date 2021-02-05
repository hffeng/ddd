package com.swhy.infrastructure;

import com.swhy.infrastructure.vo.AccountVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {

    List<AccountVO> findAll();

}
