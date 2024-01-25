
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.games.returns.api.returntickets;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ticket {

    @SerializedName("productId")
    @Expose
    private Integer productId;
    @SerializedName("packId")
    @Expose
    private Integer packId;
    @SerializedName("salesAdjustment")
    @Expose
    private Integer salesAdjustment;
    @SerializedName("itemFrom")
    @Expose
    private Integer itemFrom;
    @SerializedName("itemTo")
    @Expose
    private Integer itemTo;
    @SerializedName("returnId")
    @Expose
    private Integer returnId;
    @SerializedName("ticketPrice")
    @Expose
    private Integer ticketPrice;
    @SerializedName("status")
    @Expose
    private Integer status;

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

    public Integer getSalesAdjustment() {
        return salesAdjustment;
    }

    public void setSalesAdjustment(Integer salesAdjustment) {
        this.salesAdjustment = salesAdjustment;
    }

    public Integer getItemFrom() {
        return itemFrom;
    }

    public void setItemFrom(Integer itemFrom) {
        this.itemFrom = itemFrom;
    }

    public Integer getItemTo() {
        return itemTo;
    }

    public void setItemTo(Integer itemTo) {
        this.itemTo = itemTo;
    }

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public Integer getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
