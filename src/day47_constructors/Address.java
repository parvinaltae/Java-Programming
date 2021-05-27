package day47_constructors;

public class Address {
    private String street, city, state;
    private int zipCode;
    private String country = "USA";

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
       this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return  street+", "+ city+", "+ state + " " + "zipCode";
    }
}
