
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class ItIsUsedToPlayAWagerModel {

    @SerializedName("wager")
    @Expose
    private Wager wager;
    @SerializedName("serialNumber")
    @Expose
    private String serialNumber;
    /**
     * No args constructor for use in serialization
     */
    public ItIsUsedToPlayAWagerModel() {
    }

    /**
     * @param wager
     */
    public ItIsUsedToPlayAWagerModel(Wager wager) {
        super();
        this.wager = wager;
    }

    public Wager getWager() {
        return wager;
    }

    public void setWager(Wager wager) {
        this.wager = wager;
    }

    public BigDecimal getTotalStake() {
        return getWager().getSportsbook().getBets().stream().map(Bet::getTotalStake).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public Long getBetSlipId() {
        return getWager().getSportsbook().getBetSlipId();
    }

    public List<Bet> getBets() {
        return getWager().getSportsbook().getBets();
    }

    public boolean isAccepted() {
        return wager.getSportsbook().getBets().stream().allMatch(bet -> bet.getStatus().equals("ACCEPTED"));
    }

    public BigDecimal getPotentialPayout() {
        return wager.getSportsbook().getBets().stream().map(Bet::getPotentialPayout).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }
}
