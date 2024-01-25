
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Bet {

    @SerializedName("barcode")
    @Expose
    private String barcode;
    @SerializedName("betId")
    @Expose
    private Long betId;
    @SerializedName("betNo")
    @Expose
    private Integer betNo;
    @SerializedName("potentialBonusWinnings")
    @Expose
    private BigDecimal potentialBonusWinnings;
    @SerializedName("potentialPayout")
    @Expose
    private BigDecimal potentialPayout;
    @SerializedName("selections")
    @Expose
    private List<Selection> selections = new LinkedList<Selection>();
    @SerializedName("stake")
    @Expose
    private Stake stake;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("system")
    @Expose
    private System system;
    @SerializedName("totalPrice")
    @Expose
    private BigDecimal totalPrice;
    @SerializedName("totalStake")
    @Expose
    private BigDecimal totalStake;
    @SerializedName("rejectionReason")
    @Expose
    private String rejectionReason;
    @SerializedName("totalDiscountStake")
    @Expose
    private BigDecimal totalDiscountStake;

    /**
     * No args constructor for use in serialization
     *
     */
    public Bet() {
    }

    /**
     *
     * @param potentialBonusWinnings
     * @param system
     * @param stake
     * @param totalStake
     * @param status
     * @param selections
     * @param barcode
     * @param betNo
     * @param potentialPayout
     * @param totalPrice
     * @param betId
     */
    public Bet(String barcode, Long betId, Integer betNo, BigDecimal potentialBonusWinnings, BigDecimal potentialPayout, List<Selection> selections, Stake stake, String status, System system, BigDecimal totalPrice, BigDecimal totalStake) {
        super();
        this.barcode = barcode;
        this.betId = betId;
        this.betNo = betNo;
        this.potentialBonusWinnings = potentialBonusWinnings;
        this.potentialPayout = potentialPayout;
        this.selections = selections;
        this.stake = stake;
        this.status = status;
        this.system = system;
        this.totalPrice = totalPrice;
        this.totalStake = totalStake;
    }

    public BigDecimal getTotalDiscountStake() {
        return totalDiscountStake;
    }

    public void setTotalDiscountStake(BigDecimal totalDiscountStake) {
        this.totalDiscountStake = totalDiscountStake;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Long getBetId() {
        return betId;
    }

    public void setBetId(Long betId) {
        this.betId = betId;
    }

    public Integer getBetNo() {
        return betNo;
    }

    public void setBetNo(Integer betNo) {
        this.betNo = betNo;
    }

    public BigDecimal getPotentialBonusWinnings() {
        return potentialBonusWinnings;
    }

    public void setPotentialBonusWinnings(BigDecimal potentialBonusWinnings) {
        this.potentialBonusWinnings = potentialBonusWinnings;
    }

    public BigDecimal getPotentialPayout() {
        return potentialPayout;
    }

    public void setPotentialPayout(BigDecimal potentialPayout) {
        this.potentialPayout = potentialPayout;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalStake() {
        return totalStake;
    }

    public void setTotalStake(BigDecimal totalStake) {
        this.totalStake = totalStake;
    }

    public String toJsonString() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.TRANSIENT, Modifier.VOLATILE)
                .create();
        return gson.toJson(this);
    }

}
