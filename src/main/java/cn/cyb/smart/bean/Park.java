package cn.cyb.smart.bean;

public class Park {
    private int parkId;
    private String area;
    private int tradeState;
    private String parkName;

    @Override
    public String toString() {
        return "Park{" +
                "parkId=" + parkId +
                ", area='" + area + '\'' +
                ", tradeState=" + tradeState +
                ", parkName='" + parkName + '\'' +
                '}';
    }

    public int getParkId() {
        return parkId;
    }

    public void setParkId(int parkId) {
        this.parkId = parkId;
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
}
