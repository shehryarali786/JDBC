package org.example.com.country;

public class Country {

    private int countryId;
    private String countryName;
    private String countryCapital;
    private int countryCode;

    public Country(int countryId, String countryName, String countryCapital, int countryCode) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryCapital = countryCapital;
        this.countryCode = countryCode;
    }

    public Country(String countryName, String countryCapital, int countryCode) {
        this.countryName = countryName;
        this.countryCapital = countryCapital;
        this.countryCode = countryCode;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", countryCapital='" + countryCapital + '\'' +
                ", countryCode=" + countryCode +
                '}';
    }
}
