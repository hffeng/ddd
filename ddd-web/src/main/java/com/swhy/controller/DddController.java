package com.swhy.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.swhy.application.AccountManager;
import com.swhy.application.dto.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/ddd")
public class DddController {

    @Autowired
    private AccountManager accountManager;

    @RequestMapping("/hello")
    @ResponseBody
    public String dddHello(){
        return accountManager.getAccountInfo(new AccountDTO("hello"));
    }

    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        return JSON.toJSONString(accountManager.getInfoList());
    }
}
