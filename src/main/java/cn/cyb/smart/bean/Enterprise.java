package cn.cyb.smart.bean;

public class Enterprise {
    private int enterpriseId;
    private String enterpriseName;
    private String enterPriseLe;
    private String contractNumber;
    private String contact;
    private int personNumber;
    private int useState;
    private String leaveReason;
    private String contactPhone;
    private String roomName;

    @Override
    public String toString() {
        return "Enterprise{" +
                "enterpriseId=" + enterpriseId +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", enterPriseLe='" + enterPriseLe + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", contact='" + contact + '\'' +
                ", personNumber=" + personNumber +
                ", useState=" + useState +
                ", leaveReason='" + leaveReason + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", roomName='" + roomName + '\'' +
                '}';
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterPriseLe() {
        return enterPriseLe;
    }

    public void setEnterPriseLe(String enterPriseLe) {
        this.enterPriseLe = enterPriseLe;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    public int getUseState() {
        return useState;
    }

    public void setUseState(int useState) {
        this.useState = useState;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
