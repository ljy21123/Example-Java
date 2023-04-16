package 클래스_다이어그램_Ex03;

public class Address {

    private String city = "부산시";
    private String gu = "부산진구";
    private String streetName = "엄광로";
    private String buildingNumber = "176";

    public String toString() {
        return (", 주소 = " + getCity() + " " + getGu() + " " + getStreetName() + " " + getBuildingNumber());
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGu() {
        return gu;
    }

    public void setGu(String gu) {
        this.gu = gu;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }
}
