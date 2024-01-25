
package com.intralot.qa.automation.core.lottery.apigatewayj.models.channelgames.getchannelrecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeamPlayParams {

    @SerializedName("teamPlay")
    @Expose
    private Boolean teamPlay;
    @SerializedName("minShares")
    @Expose
    private Long minShares;
    @SerializedName("maxShares")
    @Expose
    private Long maxShares;
    @SerializedName("allowDecimalShares")
    @Expose
    private Boolean allowDecimalShares;

    public Boolean getTeamPlay() {
        return teamPlay;
    }

    public void setTeamPlay(Boolean teamPlay) {
        this.teamPlay = teamPlay;
    }

    public Long getMinShares() {
        return minShares;
    }

    public void setMinShares(Long minShares) {
        this.minShares = minShares;
    }

    public Long getMaxShares() {
        return maxShares;
    }

    public void setMaxShares(Long maxShares) {
        this.maxShares = maxShares;
    }

    public Boolean getAllowDecimalShares() {
        return allowDecimalShares;
    }

    public void setAllowDecimalShares(Boolean allowDecimalShares) {
        this.allowDecimalShares = allowDecimalShares;
    }

}
