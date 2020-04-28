package cn.cyb.smart.bean;

public class unPush {
    private String enterpriseName;
    private int personNumber;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    @Override
    public String toString() {
        return "unPush{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", personNumber=" + personNumber +
                '}';
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }
}
