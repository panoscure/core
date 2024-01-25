
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Wager {

    @SerializedName("dbg")
    @Expose
    private List<Dbg> dbg = null;
    @SerializedName("instant")
    @Expose
    private Instant instant;
    @SerializedName("spbt")
    @Expose
    private Spbt spbt;
    @SerializedName("sportsbook")
    @Expose
    private Sportsbook sportsbook;
    @SerializedName("productId")
    @Expose
    private Integer productId;

    public List<Dbg> getDbg() {
        return dbg;
    }

    public void setDbg(List<Dbg> dbg) {
        this.dbg = dbg;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public Spbt getSpbt() {
        return spbt;
    }

    public void setSpbt(Spbt spbt) {
        this.spbt = spbt;
    }

    public Sportsbook getSportsbook() {
        return sportsbook;
    }

    public void setSportsbook(Sportsbook sportsbook) {
        this.sportsbook = sportsbook;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

}
