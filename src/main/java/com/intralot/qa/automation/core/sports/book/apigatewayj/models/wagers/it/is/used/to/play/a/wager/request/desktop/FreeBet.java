package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FreeBet {

    @SerializedName("freeBet")
    @Expose
    private Boolean freeBet=true;
    @SerializedName("accountBonusId")
    @Expose
    private String accountBonusId;
    @SerializedName("bonusStake")
    @Expose
    private BonusStake bonusStake;

    public FreeBet(){
        bonusStake=new BonusStake();
    }

    public Boolean getFreeBet() {
        return freeBet;
    }

    public void setFreeBet(Boolean freeBet) {
        this.freeBet = freeBet;
    }

    public String getAccountBonusId() {
        return accountBonusId;
    }

    public void setAccountBonusId(String accountBonusId) {
        this.accountBonusId = accountBonusId;
    }

    public BonusStake getBonusStake() {
        return bonusStake;
    }

    public void setBonusStake(BonusStake bonusStake) {
        this.bonusStake = bonusStake;
    }

}