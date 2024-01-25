
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;

public class ValidationDeadline {

    @SerializedName("operatorId")
    @Expose
    private String operatorId;
    @SerializedName("channelId")
    @Expose
    private String channelId;
    @SerializedName("normalWinners")
    @Expose
    private Long normalWinners;
    @SerializedName("highWinners")
    @Expose
    private Long highWinners;
    @SerializedName("expireHighWinningsAfterClaim")
    @Expose
    private Boolean expireHighWinningsAfterClaim;
    @SerializedName("highWinnersProvisionalPeriod")
    @Expose
    private BigInteger highWinnersProvisionalPeriod;
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

    public Long getNormalWinners() {
        return normalWinners;
    }

    public void setNormalWinners(Long normalWinners) {
        this.normalWinners = normalWinners;
    }

    public Long getHighWinners() {
        return highWinners;
    }

    public void setHighWinners(Long highWinners) {
        this.highWinners = highWinners;
    }

    public Boolean getExpireHighWinningsAfterClaim() {
        return expireHighWinningsAfterClaim;
    }

    public void setExpireHighWinningsAfterClaim(Boolean expireHighWinningsAfterClaim) {
        this.expireHighWinningsAfterClaim = expireHighWinningsAfterClaim;
    }

    public BigInteger getHighWinnersProvisionalPeriod() {
        return highWinnersProvisionalPeriod;
    }

    public void setHighWinnersProvisionalPeriod(BigInteger highWinnersProvisionalPeriod) {
        this.highWinnersProvisionalPeriod = highWinnersProvisionalPeriod;
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
