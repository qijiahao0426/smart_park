package cn.cyb.smart.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class Repair {
    private int repairId;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date repairTime;
    private String enterpriseName;
    private String repairPhone;
    private int repairType;
    private String breakDes;
    private int repairState;

    public int getRepairId() {
        return repairId;
    }

    public void setRepairId(int repairId) {
        this.repairId = repairId;
    }

    public Date getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Date repairTime) {
        this.repairTime = repairTime;
    }

    @Override
    public String toString() {
        return "Repair{" +
                "repairId=" + repairId +
                ", repairTime=" + repairTime +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", repairPhone='" + repairPhone + '\'' +
                ", repairType=" + repairType +
                ", breakDes='" + breakDes + '\'' +
                ", repairState=" + repairState +
                '}';
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getRepairPhone() {
        return repairPhone;
    }

    public void setRepairPhone(String repairPhone) {
        this.repairPhone = repairPhone;
    }

    public int getRepairType() {
        return repairType;
    }

    public void setRepairType(int repairType) {
        this.repairType = repairType;
    }

    public String getBreakDes() {
        return breakDes;
    }

    public void setBreakDes(String breakDes) {
        this.breakDes = breakDes;
    }

    public int getRepairState() {
        return repairState;
    }

    public void setRepairState(int repairState) {
        this.repairState = repairState;
    }
}
