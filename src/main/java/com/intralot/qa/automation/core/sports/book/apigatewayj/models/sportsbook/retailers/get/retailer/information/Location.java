package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.retailers.get.retailer.information;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {
    @SerializedName("countryCode")
    @Expose
    private String countryCode;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("county")
    @Expose
    private String county;
    private String town;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("houseNumber")
    @Expose
    private int houseNumber;
    @SerializedName("postCode")
    @Expose
    private String postCode;
    private int longitude;
    private int latitude;

    public Location() {
    }

    public Location(String countryCode, String region, String county, String town, String street, int houseNumber, String postCode, int longitude, int latitude) {
        this.countryCode = countryCode;
        this.region = region;
        this.county = county;
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
        this.postCode = postCode;
        this.longitude = longitude;
        this.latitude = latitude;

    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Location withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Location withRegion(String region) {
        this.region = region;
        return this;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Location withCounty(String county) {
        this.county = county;
        return this;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Location withStreet(String street) {
        this.street = street;
        return this;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Location withHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Location withPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
}