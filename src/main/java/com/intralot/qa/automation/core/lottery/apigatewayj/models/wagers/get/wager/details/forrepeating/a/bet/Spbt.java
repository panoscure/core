
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Spbt {

    @SerializedName("acceptOdds")
    @Expose
    private Integer acceptOdds;
    @SerializedName("acceptPriceChange")
    @Expose
    private Boolean acceptPriceChange;
    @SerializedName("bets")
    @Expose
    private Bets bets;
    @SerializedName("extendedResponse")
    @Expose
    private Boolean extendedResponse;
    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("voucherCode")
    @Expose
    private String voucherCode;

    public Integer getAcceptOdds() {
        return acceptOdds;
    }

    public void setAcceptOdds(Integer acceptOdds) {
        this.acceptOdds = acceptOdds;
    }

    public Boolean getAcceptPriceChange() {
        return acceptPriceChange;
    }

    public void setAcceptPriceChange(Boolean acceptPriceChange) {
        this.acceptPriceChange = acceptPriceChange;
    }

    public Bets getBets() {
        return bets;
    }

    public void setBets(Bets bets) {
        this.bets = bets;
    }

    public Boolean getExtendedResponse() {
        return extendedResponse;
    }

    public void setExtendedResponse(Boolean extendedResponse) {
        this.extendedResponse = extendedResponse;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

}
