package cn.cyb.smart.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Complain {
    private int complainId;
    private String complainer;
    private String enterpriseName;
    private int complainType;
    private String offender;
    private String content;
    private int type;
    private String response;

    @Override
    public String toString() {
        return "Complain{" +
                "complainId=" + complainId +
                ", complainer='" + complainer + '\'' +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", complainType=" + complainType +
                ", offender='" + offender + '\'' +
                ", content='" + content + '\'' +
                ", type=" + type +
                ", response='" + response + '\'' +
                ", showTime=" + showTime +
                '}';
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date showTime;

    public int getComplainId() {
        return complainId;
    }

    public void setComplainId(int complainId) {
        this.complainId = complainId;
    }

    public String getComplainer() {
        return complainer;
    }

    public void setComplainer(String complainer) {
        this.complainer = complainer;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public int getComplainType() {
        return complainType;
    }

    public void setComplainType(int complainType) {
        this.complainType = complainType;
    }

    public String getOffender() {
        return offender;
    }

    public void setOffender(String offender) {
        this.offender = offender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
