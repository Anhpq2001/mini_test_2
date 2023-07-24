package ManageTimeForCompany;

public class Address {
    private int houseNumber;
    private String ward;
    private String province;

    public Address() {
    }

    public Address(int houseNumber, String ward, String province) {
        this.houseNumber = houseNumber;
        this.ward = ward;
        this.province = province;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
