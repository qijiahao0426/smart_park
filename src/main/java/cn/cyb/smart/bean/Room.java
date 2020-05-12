package cn.cyb.smart.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Room {
    private String roomName;
    private int roomHigh;
    private int roomArea;
    private String rentType;
    private double roomPrice;
    private int roomState;
    private String timeToUse;
    private String enterpriseName;
    private String buildName;
    private String parkName;
    private String area;
    private int tradeState;

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

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
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

    @Override
    public String toString() {
        return "Room{" +
                "roomName=" + roomName +
                ", roomHigh=" + roomHigh +
                ", roomArea=" + roomArea +
                ", rentType='" + rentType + '\'' +
                ", roomPrice=" + roomPrice +
                ", roomState=" + roomState +
                ", timeToUse='" + timeToUse + '\'' +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", buildName='" + buildName + '\'' +
                ", parkName='" + parkName + '\'' +
                ", area='" + area + '\'' +
                ", tradeState=" + tradeState +
                '}';
    }

    public String getTimeToUse() {
        return timeToUse;
    }

    public void setTimeToUse(String timeToUse) {
        this.timeToUse = timeToUse;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }
}
