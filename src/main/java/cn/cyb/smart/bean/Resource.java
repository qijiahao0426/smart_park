package cn.cyb.smart.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Resource {
    private int resourceId;
    private String resourceName;
    private String resourceType;
    private String des;
    private String note;
    private int totalUsed;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date createTime;
    private int state;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date stopTime;
    private String stopReason;

    @Override
    public String toString() {
        return "Resource{" +
                "resourceId=" + resourceId +
                ", resourceName='" + resourceName + '\'' +
                ", resourceType='" + resourceType + '\'' +
                ", des='" + des + '\'' +
                ", note='" + note + '\'' +
                ", totalUsed=" + totalUsed +
                ", createTime=" + createTime +
                ", state=" + state +
                ", stopTime=" + stopTime +
                ", stopReason='" + stopReason + '\'' +
                '}';
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getTotalUsed() {
        return totalUsed;
    }

    public void setTotalUsed(int totalUsed) {
        this.totalUsed = totalUsed;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public String getStopReason() {
        return stopReason;
    }

    public void setStopReason(String stopReason) {
        this.stopReason = stopReason;
    }
}
