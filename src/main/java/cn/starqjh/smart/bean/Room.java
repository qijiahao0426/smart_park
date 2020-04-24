package cn.starqjh.smart.bean;

import java.util.Date;

public class Room {
    private int roomName;
    private int roomHigh;
    private int roomArea;
    private String rentType;
    private double roomPrice;
    private int roomState;
    private Date datetime;
    private String enterprise;
    private String buildName;
    private String parkName;
    private String area;
    private int tradeState;

    @Override
    public String toString() {
        return "Room{" +
                "roomName=" + roomName +
                ", roomHigh=" + roomHigh +
                ", roomArea=" + roomArea +
                ", rentType='" + rentType + '\'' +
                ", roomPrice=" + roomPrice +
                ", roomState=" + roomState +
                ", datetime=" + datetime +
                ", enterprise='" + enterprise + '\'' +
                ", buildName='" + buildName + '\'' +
                ", parkName='" + parkName + '\'' +
                ", area='" + area + '\'' +
                ", tradeState=" + tradeState +
                '}';
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getTradeState() {
        return tradeState;
    }

    public void setTradeState(int tradeState) {
        this.tradeState = tradeState;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public int getRoomName() {
        return roomName;
    }

    public void setRoomName(int roomName) {
        this.roomName = roomName;
    }

    public int getRoomHigh() {
        return roomHigh;
    }

    public void setRoomHigh(int roomHigh) {
        this.roomHigh = roomHigh;
    }

    public int getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(int roomArea) {
        this.roomArea = roomArea;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getRoomState() {
        return roomState;
    }

    public void setRoomState(int roomState) {
        this.roomState = roomState;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }
}
