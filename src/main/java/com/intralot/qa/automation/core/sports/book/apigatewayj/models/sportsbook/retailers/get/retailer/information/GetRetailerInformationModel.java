package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.retailers.get.retailer.information;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetRetailerInformationModel {
    @SerializedName("externalRetailerId")
    @Expose
    private String externalRetailerId;
    @SerializedName("retailerStatus")
    @Expose
    private String retailerStatus;
    @SerializedName("bettingVerticalStatus")
    @Expose
    private String bettingVerticalStatus;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("settlementEnabled")
    @Expose
    private Boolean settlementEnabled;
    @SerializedName("placementEnabled")
    @Expose
    private Boolean placementEnabled;
    @SerializedName("contactDetails")
    @Expose
    private ContactDetails contactDetails;
    @SerializedName("currencyCode")
    @Expose
    private String currencyCode;

    public String getExternalRetailerId() {
        return externalRetailerId;
    }

    public void setExternalRetailerId(String externalRetailerId) {
        this.externalRetailerId = externalRetailerId;
    }

    public GetRetailerInformationModel withExternalRetailerId(String externalRetailerId) {
        this.externalRetailerId = externalRetailerId;
        return this;
    }

    public String getRetailerStatus() {
        return retailerStatus;
    }

    public void setRetailerStatus(String retailerStatus) {
        this.retailerStatus = retailerStatus;
    }

    public GetRetailerInformationModel withRetailerStatus(String retailerStatus) {
        this.retailerStatus = retailerStatus;
        return this;
    }

    public String getBettingVerticalStatus() {
        return bettingVerticalStatus;
    }

    public void setBettingVerticalStatus(String bettingVerticalStatus) {
        this.bettingVerticalStatus = bettingVerticalStatus;
    }

    public GetRetailerInformationModel withBettingVerticalStatus(String bettingVerticalStatus) {
        this.bettingVerticalStatus = bettingVerticalStatus;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public GetRetailerInformationModel withLocation(Location location) {
        this.location = location;
        return this;
    }

    public Boolean getSettlementEnabled() {
        return settlementEnabled;
    }

    public void setSettlementEnabled(Boolean settlementEnabled) {
        this.settlementEnabled = settlementEnabled;
    }

    public GetRetailerInformationModel withSettlementEnabled(Boolean settlementEnabled) {
        this.settlementEnabled = settlementEnabled;
        return this;
    }

    public Boolean getPlacementEnabled() {
        return placementEnabled;
    }

    public void setPlacementEnabled(Boolean placementEnabled) {
        this.placementEnabled = placementEnabled;
    }

    public GetRetailerInformationModel withPlacementEnabled(Boolean placementEnabled) {
        this.placementEnabled = placementEnabled;
        return this;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public GetRetailerInformationModel withContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public GetRetailerInformationModel withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
}