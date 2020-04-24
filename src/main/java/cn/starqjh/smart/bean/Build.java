package cn.starqjh.smart.bean;

public class Build {
    private int buildId;
    private String buildName;
    private int buildNumber;
    private int buildFloor;
    private String buildArea;
    private int buildType;
    private String parkName;

    public int getBuildId() {
        return buildId;
    }

    public void setBuildId(int buildId) {
        this.buildId = buildId;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(int buildNumber) {
        this.buildNumber = buildNumber;
    }

    public int getBuildFloor() {
        return buildFloor;
    }

    public void setBuildFloor(int buildFloor) {
        this.buildFloor = buildFloor;
    }

    public String getBuildArea() {
        return buildArea;
    }

    public void setBuildArea(String buildArea) {
        this.buildArea = buildArea;
    }

    public int getBuildType() {
        return buildType;
    }

    public void setBuildType(int buildType) {
        this.buildType = buildType;
    }

    @Override
    public String toString() {
        return "Build{" +
                "buildId=" + buildId +
                ", buildName='" + buildName + '\'' +
                ", buildNumber=" + buildNumber +
                ", buildFloor=" + buildFloor +
                ", buildArea='" + buildArea + '\'' +
                ", buildType=" + buildType +
                ", parkName='" + parkName + '\'' +
                '}';
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }
}
