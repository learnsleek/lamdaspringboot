package com.moneyclub.dto;

public class ResponseDTO implements  DTO {

    private int errorCode;
    private String errorMessage;

    public ResponseDTO(int errorCode, String errorMessage){
        this.errorCode =errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
