package com.moneyclub.dto;

import java.sql.Timestamp;
import java.util.List;

public class CampaignDTO implements DTO {

    private long id;
    private int status;
    private String name;
    private String type;
    private Timestamp createdTime;
    private Timestamp dispatchTime;
    private String desc;
    private String message;
    private int count;
    private String statusTxt;
    private List<CampaignDetailDTO> campaignDetailsList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Timestamp dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<CampaignDetailDTO> getCampaignDetailsList() {
        return campaignDetailsList;
    }

    public void setCampaignDetailsList(List<CampaignDetailDTO> campaignDetailsList) {
        this.campaignDetailsList = campaignDetailsList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getStatusTxt() {
        return statusTxt;
    }

    public void setStatusTxt(String statusTxt) {
        this.statusTxt = statusTxt;
    }
}
