
package com.intralot.qa.automation.core.lottery.apigatewayj.models.employee.wallet.management.get.employee.inventory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetailerPocket {

    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("iid")
    @Expose
    private String iid;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
