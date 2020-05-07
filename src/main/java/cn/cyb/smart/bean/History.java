package cn.cyb.smart.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class History {
    private int historyId;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date visTime;
    private String visEnterprise;
    private String visitor;
    private int vis;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date reachTime;
    private String reason;

    @Override
    public String toString() {
        return "History{" +
                "historyId=" + historyId +
                ", visTime=" + visTime +
                ", visEnterprise='" + visEnterprise + '\'' +
                ", visitor='" + visitor + '\'' +
                ", vis=" + vis +
                ", reachTime=" + reachTime +
                ", reason='" + reason + '\'' +
                '}';
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public Date getVisTime() {
        return visTime;
    }

    public void setVisTime(Date visTime) {
        this.visTime = visTime;
    }

    public String getVisEnterprise() {
        return visEnterprise;
    }

    public void setVisEnterprise(String visEnterprise) {
        this.visEnterprise = visEnterprise;
    }

    public int getVis() {
        return vis;
    }

    public void setVis(int vis) {
        this.vis = vis;
    }

    public Date getReachTime() {
        return reachTime;
    }

    public void setReachTime(Date reachTime) {
        this.reachTime = reachTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
