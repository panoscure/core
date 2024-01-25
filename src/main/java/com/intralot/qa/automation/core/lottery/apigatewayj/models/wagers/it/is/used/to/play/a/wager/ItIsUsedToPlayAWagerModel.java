
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

public class ItIsUsedToPlayAWagerModel {

    @SerializedName("wagerId")
    @Expose
    private BigInteger wagerId;
    @SerializedName("pilot")
    @Expose
    private Boolean pilot;
    @SerializedName("promotionOutcomes")
    @Expose
    private List<PromotionOutcome> promotionOutcomes = null;
    @SerializedName("serialNumbers")
    @Expose
    private List<String> serialNumbers = null;
    @SerializedName("serialNumber")
    @Expose
    private String serialNumber = null;
    @SerializedName("additionalSerialNumbers")
    @Expose
    private List<String> additionalSerialNumbers = null;
    @SerializedName("wager")
    @Expose
    private Wager wager;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("products")
    @Expose
    private Products products;

    public BigInteger getWagerId() {
        return wagerId;
    }

    public void setWagerId(BigInteger wagerId) {
        this.wagerId = wagerId;
    }

    public Boolean getPilot() {
        return pilot;
    }

    public void setPilot(Boolean pilot) {
        this.pilot = pilot;
    }

    public List<PromotionOutcome> getPromotionOutcomes() {
        return promotionOutcomes;
    }

    public void setPromotionOutcomes(List<PromotionOutcome> promotionOutcomes) {
        this.promotionOutcomes = promotionOutcomes;
    }

    public List<String> getSerialNumbers() {
        return serialNumbers;
    }

    public void setSerialNumbers(List<String> serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public List<String> getAdditionalSerialNumbers() {
        return additionalSerialNumbers;
    }

    public void setAdditionalSerialNumbers(List<String> additionalSerialNumbers) {
        this.additionalSerialNumbers = additionalSerialNumbers;
    }

    public Wager getWager() {
        return wager;
    }

    public void setWager(Wager wager) {
        this.wager = wager;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }
}
