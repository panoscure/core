
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.full.details.fora.specific.bet.slip.id.BetPart;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Parts {

    @SerializedName("betPart")
    @Expose
    private List<BetPart> betPart = null;
    @SerializedName("rate")
    @Expose
    private Integer rate;
    @SerializedName("internalWinning")
    @Expose
    private Integer internalWinning;

    public List<BetPart> getBetPart() {
        return betPart;
    }

    public void setBetPart(List<BetPart> betPart) {
        this.betPart = betPart;
    }

    public Parts withBetPart(List<BetPart> betPart) {
        this.betPart = betPart;
        return this;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Parts withRate(Integer rate) {
        this.rate = rate;
        return this;
    }

    public Integer getInternalWinning() {
        return internalWinning;
    }

    public void setInternalWinning(Integer internalWinning) {
        this.internalWinning = internalWinning;
    }

    public Parts withInternalWinning(Integer internalWinning) {
        this.internalWinning = internalWinning;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("betPart", betPart).append("rate", rate).append("internalWinning", internalWinning).toString();
    }

}
