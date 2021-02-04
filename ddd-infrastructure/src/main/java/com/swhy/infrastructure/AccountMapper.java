package com.swhy.infrastructure;

import com.swhy.infrastructure.vo.AccountVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface AccountMapper {

    List<AccountVO> findAll();

}
