
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.games.order.api.gets.orders.based.on.search.criteria;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order {

    @SerializedName("orderId")
    @Expose
    private Integer orderId;
    @SerializedName("retailerId")
    @Expose
    private Integer retailerId;
    @SerializedName("employeeId")
    @Expose
    private String employeeId;
    @SerializedName("orderStatus")
    @Expose
    private String orderStatus;
    @SerializedName("orderStatusId")
    @Expose
    private Integer orderStatusId;
    @SerializedName("priority")
    @Expose
    private String priority;
    @SerializedName("warehouse")
    @Expose
    private String warehouse;
    @SerializedName("issuedOn")
    @Expose
    private String issuedOn;
    @SerializedName("editable")
    @Expose
    private Boolean editable;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(Integer retailerId) {
        this.retailerId = retailerId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(Integer orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getIssuedOn() {
        return issuedOn;
    }

    public void setIssuedOn(String issuedOn) {
        this.issuedOn = issuedOn;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

}
