
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.games.games.api.returns.all.active.games;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ActiveGame {

    @SerializedName("productId")
    @Expose
    private Integer productId;
    @SerializedName("productStatus")
    @Expose
    private Integer productStatus;
    @SerializedName("productStatusDescription")
    @Expose
    private String productStatusDescription;
    @SerializedName("productDescription")
    @Expose
    private String productDescription;
    @SerializedName("productVersion")
    @Expose
    private Integer productVersion;
    @SerializedName("productOperator")
    @Expose
    private Integer productOperator;
    @SerializedName("ticketPrice")
    @Expose
    private Double ticketPrice;
    @SerializedName("externalId")
    @Expose
    private String externalId;
    @SerializedName("packsPerCarton")
    @Expose
    private Integer packsPerCarton;
    @SerializedName("ticketsPerPack")
    @Expose
    private Integer ticketsPerPack;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductStatusDescription() {
        return productStatusDescription;
    }

    public void setProductStatusDescription(String productStatusDescription) {
        this.productStatusDescription = productStatusDescription;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(Integer productVersion) {
        this.productVersion = productVersion;
    }

    public Integer getProductOperator() {
        return productOperator;
    }

    public void setProductOperator(Integer productOperator) {
        this.productOperator = productOperator;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Integer getPacksPerCarton() {
        return packsPerCarton;
    }

    public void setPacksPerCarton(Integer packsPerCarton) {
        this.packsPerCarton = packsPerCarton;
    }

    public Integer getTicketsPerPack() {
        return ticketsPerPack;
    }

    public void setTicketsPerPack(Integer ticketsPerPack) {
        this.ticketsPerPack = ticketsPerPack;
    }

}
