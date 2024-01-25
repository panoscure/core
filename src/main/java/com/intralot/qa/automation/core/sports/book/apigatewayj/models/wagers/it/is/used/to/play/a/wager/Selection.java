
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Selection {

    @SerializedName("eventId")
    @Expose
    private Integer eventId;
    @SerializedName("odds")
    @Expose
    private Odds odds;
    @SerializedName("partNo")
    @Expose
    private Integer partNo;
    @SerializedName("selectionId")
    @Expose
    private String selectionId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("selectionName")
    @Expose
    private String selectionName;
    @SerializedName("marketName")
    @Expose
    private String marketName;
    @SerializedName("eventName")
    @Expose
    private String eventName;
    @SerializedName("eventTime")
    @Expose
    private Long eventTime;
    @SerializedName("priceChangedAfterLockDate")
    @Expose
    private Boolean priceChangedAfterLockDate;
    @SerializedName("inplay")
    @Expose
    private Boolean inplay;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Selection() {
    }

    /**
     *  @param eventId
     * @param odds
     * @param partNo
     * @param selectionId
     * @param status
     * @param selectionName
     * @param marketName
     * @param eventName
     * @param eventTime
     * @param priceChangedAfterLockDate
     * @param inplay
     */
    public Selection(Integer eventId, Odds odds, Integer partNo, String selectionId, String status, String selectionName, String marketName, String eventName, Long eventTime, Boolean priceChangedAfterLockDate, Boolean inplay) {
        super();
        this.eventId = eventId;
        this.odds = odds;
        this.partNo = partNo;
        this.selectionId = selectionId;
        this.status = status;
        this.selectionName = selectionName;
        this.marketName = marketName;
        this.eventName = eventName;
        this.eventTime = eventTime;
        this.priceChangedAfterLockDate = priceChangedAfterLockDate;
        this.inplay = inplay;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds odds) {
        this.odds = odds;
    }

    public Integer getPartNo() {
        return partNo;
    }

    public void setPartNo(Integer partNo) {
        this.partNo = partNo;
    }

    public String getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(String selectionId) {
        this.selectionId = selectionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSelectionName() {
        return selectionName;
    }

    public void setSelectionName(String selectionName) {
        this.selectionName = selectionName;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public Boolean getPriceChangedAfterLockDate() {
        return priceChangedAfterLockDate;
    }

    public void setPriceChangedAfterLockDate(Boolean priceChangedAfterLockDate) {
        this.priceChangedAfterLockDate = priceChangedAfterLockDate;
    }

    public Boolean getInplay() {
        return inplay;
    }

    public void setInplay(Boolean inplay) {
        this.inplay = inplay;
    }

}
