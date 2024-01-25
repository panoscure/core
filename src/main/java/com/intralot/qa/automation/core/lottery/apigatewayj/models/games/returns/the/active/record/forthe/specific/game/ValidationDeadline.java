package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ValidationDeadline {

    @SerializedName("operatorId")
    @Expose
    private String operatorId;
    @SerializedName("channelId")
    @Expose
    private String channelId;
    @SerializedName("highLimit")
    @Expose
    private Object highLimit;
    @SerializedName("normalWinners")
    @Expose
    private Integer normalWinners;
    @SerializedName("highWinners")
    @Expose
    private Integer highWinners;
    @SerializedName("highWinnersProvisionalPeriod")
    @Expose
    private Integer highWinnersProvisionalPeriod;
    @SerializedName("expireHighWinningsAfterClaim")
    @Expose
    private Boolean expireHighWinningsAfterClaim;
    @SerializedName("includeRemaininDaysNormal")
    @Expose
    private Boolean includeRemaininDaysNormal;
    @SerializedName("includeRemaininDaysHigh")
    @Expose
    private Boolean includeRemaininDaysHigh;

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Object getHighLimit() {
        return highLimit;
    }

    public void setHighLimit(Object highLimit) {
        this.highLimit = highLimit;
    }

    public Integer getNormalWinners() {
        return normalWinners;
    }

    public void setNormalWinners(Integer normalWinners) {
        this.normalWinners = normalWinners;
    }

    public Integer getHighWinners() {
        return highWinners;
    }

    public void setHighWinners(Integer highWinners) {
        this.highWinners = highWinners;
    }

    public Integer getHighWinnersProvisionalPeriod() {
        return highWinnersProvisionalPeriod;
    }

    public void setHighWinnersProvisionalPeriod(Integer highWinnersProvisionalPeriod) {
        this.highWinnersProvisionalPeriod = highWinnersProvisionalPeriod;
    }

    public Boolean getExpireHighWinningsAfterClaim() {
        return expireHighWinningsAfterClaim;
    }

    public void setExpireHighWinningsAfterClaim(Boolean expireHighWinningsAfterClaim) {
        this.expireHighWinningsAfterClaim = expireHighWinningsAfterClaim;
    }

    public Boolean getIncludeRemaininDaysNormal() {
        return includeRemaininDaysNormal;
    }

    public void setIncludeRemaininDaysNormal(Boolean includeRemaininDaysNormal) {
        this.includeRemaininDaysNormal = includeRemaininDaysNormal;
    }

    public Boolean getIncludeRemaininDaysHigh() {
        return includeRemaininDaysHigh;
    }

    public void setIncludeRemaininDaysHigh(Boolean includeRemaininDaysHigh) {
        this.includeRemaininDaysHigh = includeRemaininDaysHigh;
    }

}
