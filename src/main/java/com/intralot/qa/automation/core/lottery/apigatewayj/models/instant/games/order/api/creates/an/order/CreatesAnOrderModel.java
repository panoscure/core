
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.games.order.api.creates.an.order;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreatesAnOrderModel {

    @SerializedName("orderId")
    @Expose
    private Integer orderId;
    @SerializedName("priorityId")
    @Expose
    private Integer priorityId;
    @SerializedName("warehouseId")
    @Expose
    private Integer warehouseId;
    @SerializedName("orderStatus")
    @Expose
    private String orderStatus;
    @SerializedName("issuedOn")
    @Expose
    private String issuedOn;
    @SerializedName("dateTimeMod")
    @Expose
    private String dateTimeMod;
    @SerializedName("retailerId")
    @Expose
    private Integer retailerId;
    @SerializedName("employeeId")
    @Expose
    private String employeeId;
    @SerializedName("orderTypeId")
    @Expose
    private Integer orderTypeId;
    @SerializedName("orderDetails")
    @Expose
    private List<OrderDetail> orderDetails = null;
    @SerializedName("orderDetailTrans")
    @Expose
    private List<Object> orderDetailTrans = null;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getIssuedOn() {
        return issuedOn;
    }

    public void setIssuedOn(String issuedOn) {
        this.issuedOn = issuedOn;
    }

    public String getDateTimeMod() {
        return dateTimeMod;
    }

    public void setDateTimeMod(String dateTimeMod) {
        this.dateTimeMod = dateTimeMod;
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

    public Integer getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(Integer orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public List<Object> getOrderDetailTrans() {
        return orderDetailTrans;
    }

    public void setOrderDetailTrans(List<Object> orderDetailTrans) {
        this.orderDetailTrans = orderDetailTrans;
    }

}
