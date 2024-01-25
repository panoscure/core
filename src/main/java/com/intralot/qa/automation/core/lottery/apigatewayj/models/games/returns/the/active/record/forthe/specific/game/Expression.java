package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Expression {

    @SerializedName("cron")
    @Expose
    private String cron;
    @SerializedName("descr")
    @Expose
    private String descr;
    @SerializedName("typeId")
    @Expose
    private Integer typeId;

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

}
