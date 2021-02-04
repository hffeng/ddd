package com.swhy.common;

public class OrgAccountException extends RuntimeException{

    private String errorMsg;
    private int errorCode;
    private int status;

    public OrgAccountException(String errorMsg,int errorCode){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

}
