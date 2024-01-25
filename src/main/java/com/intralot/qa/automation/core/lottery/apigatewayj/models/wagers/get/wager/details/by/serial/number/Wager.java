
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.serial.number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class Wager {

    @SerializedName("dbg")
    @Expose
    private List<Dbg> dbg = null;
    @SerializedName("wagerCost")
    @Expose
    private BigDecimal wagerCost = null;

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
