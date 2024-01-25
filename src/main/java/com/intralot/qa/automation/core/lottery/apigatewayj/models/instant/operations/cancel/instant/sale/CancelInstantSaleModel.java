
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.operations.cancel.instant.sale;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CancelInstantSaleModel {

    @SerializedName("productId")
    @Expose
    private Integer productId;
    @SerializedName("packId")
    @Expose
    private Integer packId;
    @SerializedName("ticketId")
    @Expose
    private Integer ticketId;
    @SerializedName("barcode")
    @Expose
    private String barcode;
    @SerializedName("amounts")
    @Expose
    private Amounts amounts;
    @SerializedName("ticketStatus")
    @Expose
    private String ticketStatus;
    @SerializedName("ticketStatusId")
    @Expose
    private Integer ticketStatusId;
    @SerializedName("externalId")
    @Expose
    private String externalId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPackId() {
        return packId;
    }

    public void setPackId(Integer packId) {
        this.packId = packId;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Amounts getAmounts() {
        return amounts;
    }

    public void setAmounts(Amounts amounts) {
        this.amounts = amounts;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Integer getTicketStatusId() {
        return ticketStatusId;
    }

    public void setTicketStatusId(Integer ticketStatusId) {
        this.ticketStatusId = ticketStatusId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

}
