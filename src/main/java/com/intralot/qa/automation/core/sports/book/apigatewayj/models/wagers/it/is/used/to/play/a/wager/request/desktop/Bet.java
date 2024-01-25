
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Bet implements Serializable {

    @SerializedName("selections")
    @Expose
    private List<Selection> selections = new LinkedList<Selection>();
    @SerializedName("stake")
    @Expose
    private Stake stake;
    @SerializedName("system")
    @Expose
    private System system;
    @SerializedName("overAskId")
    @Expose
    private String overAskId = null;
    @SerializedName("winType")
    @Expose
    private String winType = "WIN";
    @SerializedName("referralPath")
    @Expose
    private String referralPath = null;
    @SerializedName("voucherCode")
    @Expose
    private String voucherCode ;
    @SerializedName("discountAmount")
    @Expose
    private Integer discountAmount ;

    private FreeBet freeBet;

    public Bet() {
        stake = new Stake();
        system = new System();
    }

    public List<Selection> getSelections() {
        return selections;
    }

    public void setSelections(List<Selection> selections) {
        this.selections = selections;
    }

    public Stake getStake() {
        return stake;
    }

    public void setStake(Stake stake) {
        this.stake = stake;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public Object getOverAskId() {
        return overAskId;
    }

    public void setOverAskId(String overAskId) {
        this.overAskId = overAskId;
    }

    public String getWinType() {
        return winType;
    }

    public void setWinType(String winType) {
        this.winType = winType;
    }

    public String getReferralPath() {
        return referralPath;
    }

    public void setReferralPath(String referralPath) {
        this.referralPath = referralPath;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    public Integer getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    public FreeBet getFreeBet() {
        return freeBet;
    }

    public void setFreeBet(FreeBet freeBet) {
        this.freeBet = freeBet;
    }

    public Bet addSelection(Selection selection){
        selections.add(selection);
        return this;
    }

    public Bet setStakeAmount(BigDecimal stakeAmount){
        stake.setAmount(stakeAmount);
        return this;
    }

    public Bet setStakeCurrency(String stakeCurrency){
        stake.setCurrency(stakeCurrency);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("selections", selections).append("stake", stake).append("system", system).append("overAskId", overAskId).append("winType", winType).append("referralPath", referralPath).toString();
    }

}
