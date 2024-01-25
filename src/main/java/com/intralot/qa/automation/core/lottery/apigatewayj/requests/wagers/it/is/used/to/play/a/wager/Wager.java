
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wager {

    @SerializedName("dbg")
    @Expose
    private List<Dbg> dbg = null;
    @SerializedName("instant")
    @Expose
    private Instant instant;
    @SerializedName("productId")
    @Expose
    private Integer productId;
    @SerializedName("wagerCost")
    @Expose
    private Integer wagerCost;

    public List<Dbg> getDbg() {
        return dbg;
    }

    public void setDbg(List<Dbg> dbg) {
        this.dbg = dbg;
    }

    public Wager withDbg(List<Dbg> dbg) {
        this.dbg = dbg;
        return this;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public Wager withInstant(Instant instant) {
        this.instant = instant;
        return this;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Wager withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public Integer getWagerCost() {
        return wagerCost;
    }

    public void setWagerCost(Integer wagerCost) {
        this.wagerCost = wagerCost;
    }

    public Wager withWagerCost(Integer wagerCost) {
        this.wagerCost = wagerCost;
        return this;
    }


}
