
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.an.event.by.code;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Market {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("names")
    @Expose
    private Names__ names;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("typeRef")
    @Expose
    private String typeRef;
    @SerializedName("subtype")
    @Expose
    private String subtype;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("displayed")
    @Expose
    private Boolean displayed;
    @SerializedName("betBuilder")
    @Expose
    private Boolean betBuilder;
    @SerializedName("selections")
    @Expose
    private List<Selection> selections = null;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("winningLegsBonus")
    @Expose
    private Boolean winningLegsBonus;
    @SerializedName("periodMarket")
    @Expose
    private Boolean periodMarket;
    @SerializedName("period")
    @Expose
    private String period;
    @SerializedName("grouped")
    @Expose
    private Boolean grouped;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Names__ getNames() {
        return names;
    }

    public void setNames(Names__ names) {
        this.names = names;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeRef() {
        return typeRef;
    }

    public void setTypeRef(String typeRef) {
        this.typeRef = typeRef;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getDisplayed() {
        return displayed;
    }

    public void setDisplayed(Boolean displayed) {
        this.displayed = displayed;
    }

    public Boolean getBetBuilder() {
        return betBuilder;
    }

    public void setBetBuilder(Boolean betBuilder) {
        this.betBuilder = betBuilder;
    }

    public List<Selection> getSelections() {
        return selections;
    }

    public void setSelections(List<Selection> selections) {
        this.selections = selections;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Boolean getWinningLegsBonus() {
        return winningLegsBonus;
    }

    public void setWinningLegsBonus(Boolean winningLegsBonus) {
        this.winningLegsBonus = winningLegsBonus;
    }

    public Boolean getPeriodMarket() {
        return periodMarket;
    }

    public void setPeriodMarket(Boolean periodMarket) {
        this.periodMarket = periodMarket;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Boolean getGrouped() {
        return grouped;
    }

    public void setGrouped(Boolean grouped) {
        this.grouped = grouped;
    }

}
