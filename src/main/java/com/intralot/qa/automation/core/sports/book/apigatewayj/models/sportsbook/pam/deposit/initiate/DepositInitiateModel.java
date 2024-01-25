package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.pam.deposit.initiate;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DepositInitiateModel {
    @SerializedName("merchantId")
    @Expose
    private String merchantId;
    @SerializedName("merchantRef")
    @Expose
    private String merchantRef;
    @SerializedName("merchantPublicKey")
    @Expose
    private String merchantPublicKey;
    @SerializedName("currencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("productName")
    @Expose
    private String productName;
    @SerializedName("punterEmail")
    @Expose
    private String punterEmail;
    @SerializedName("punterId")
    @Expose
    private Integer punterId;
    @SerializedName("brands")
    @Expose
    private String brands;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("sandbox")
    @Expose
    private Boolean sandbox;
    @SerializedName("data")
    @Expose
    private Data data;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantRef() {
        return merchantRef;
    }

    public void setMerchantRef(String merchantRef) {
        this.merchantRef = merchantRef;
    }

    public String getMerchantPublicKey() {
        return merchantPublicKey;
    }

    public void setMerchantPublicKey(String merchantPublicKey) {
        this.merchantPublicKey = merchantPublicKey;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPunterEmail() {
        return punterEmail;
    }

    public void setPunterEmail(String punterEmail) {
        this.punterEmail = punterEmail;
    }

    public Integer getPunterId() {
        return punterId;
    }

    public void setPunterId(Integer punterId) {
        this.punterId = punterId;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getSandbox() {
        return sandbox;
    }

    public void setSandbox(Boolean sandbox) {
        this.sandbox = sandbox;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}