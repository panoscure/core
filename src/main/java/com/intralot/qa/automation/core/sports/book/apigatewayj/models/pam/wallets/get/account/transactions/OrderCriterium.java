package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.get.account.transactions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderCriterium {
    @SerializedName("orderCriteriaName")
    @Expose
    private String orderCriteriaName;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("condition")
    @Expose
    private String condition;

    public String getOrderCriteriaName() {
        return orderCriteriaName;
    }

    public void setOrderCriteriaName(String orderCriteriaName) {
        this.orderCriteriaName = orderCriteriaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
