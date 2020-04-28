package cn.cyb.smart.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Push {
    private String enterpriseName;
    private String tax;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date pushTime;
    private int increase;
    private int personNumber;

    @Override
    public String toString() {
        return "Push{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", tax='" + tax + '\'' +
                ", pushTime=" + pushTime +
                ", increase=" + increase +
                ", personNumber=" + personNumber +
                '}';
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }

    public int getIncrease() {
        return increase;
    }

    public void setIncrease(int increase) {
        this.increase = increase;
    }
}
