
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.games.order.api.gets.orders.based.on.search.criteria;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetsOrdersBasedOnSearchCriteriaModel {

    @SerializedName("totalElements")
    @Expose
    private Integer totalElements;
    @SerializedName("orders")
    @Expose
    private List<Order> orders = null;

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}
