package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sportsbook.event.by.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MarketGroup {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("order")
    @Expose
    private Integer order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
