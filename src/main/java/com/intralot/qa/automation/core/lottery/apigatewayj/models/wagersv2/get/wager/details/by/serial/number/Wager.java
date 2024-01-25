package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagersv2.get.wager.details.by.serial.number;

import java.math.BigDecimal;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wager {

    @SerializedName("dbg")
    @Expose
    private List<Dbg> dbg;
    @SerializedName("wagerCost")
    @Expose
    private BigDecimal wagerCost;

    public List<Dbg> getDbg() {
        return dbg;
    }

    public void setDbg(List<Dbg> dbg) {
        this.dbg = dbg;
    }

    public BigDecimal getWagerCost() {
        return wagerCost;
    }

    public void setWagerCost(BigDecimal wagerCost) {
        this.wagerCost = wagerCost;
    }

}