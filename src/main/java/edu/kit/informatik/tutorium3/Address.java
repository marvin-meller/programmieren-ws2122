package edu.kit.informatik.tutorium3;

public class Address {
    private String countryCode;
    private String zipCode;
    private String street;

    public Address(String countryCode, String zipCode, String street) {
        this.countryCode = countryCode;
        this.zipCode = zipCode;
        this.street = street;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
