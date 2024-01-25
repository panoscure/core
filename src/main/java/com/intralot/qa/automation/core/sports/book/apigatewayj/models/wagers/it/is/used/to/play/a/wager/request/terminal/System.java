
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.terminal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;


public class System implements Serializable {

    @SerializedName("request")
    @Expose
    private Integer request;
    @SerializedName("stake")
    @Expose
    private Stake stake;

    public System() {
        this.stake = new Stake();
    }

    public System(Integer request) {
        super();
        this.request = request;
        this.stake = new Stake();
    }

    public System(Integer request, Stake stake) {
        super();
        this.request = request;
        this.stake = stake;
    }

    public System(Integer request, BigDecimal stake, String currency) {
        this.request = request;
        this.stake = new Stake();
        this.stake.setAmount(stake);
        this.stake.setCurrency(currency);
    }

    public System(System system) {
        this.request = system.getRequest();
        this.stake = new Stake();
    }

    public Integer getRequest() {
        return request;
    }

    public void setRequest(Integer request) {
        this.request = request;
    }

    public Stake getStake() {
        return stake;
    }

    public void setStake(Stake stake) {
        this.stake = stake;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("request", request).append("stake", stake).toString();
    }

}
