
package com.intralot.qa.automation.core.lottery.apigatewayj.models.channelgames.getchannelrecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BetLimits {

    @SerializedName("minWagerMultiplier")
    @Expose
    private Long minWagerMultiplier;
    @SerializedName("maxWagerMultiplier")
    @Expose
    private Long maxWagerMultiplier;
    @SerializedName("minBoards")
    @Expose
    private int minBoards;
    @SerializedName("maxBoards")
    @Expose
    private int maxBoards;
    @SerializedName("minColumns")
    @Expose
    private Long minColumns;
    @SerializedName("maxColumns")
    @Expose
    private Long maxColumns;
    @SerializedName("minBoardMultiplier")
    @Expose
    private Long minBoardMultiplier;
    @SerializedName("maxBoardMultiplier")
    @Expose
    private Long maxBoardMultiplier;
    @SerializedName("addonsLimits")
    @Expose
    private Object addonsLimits;

    public Long getMinWagerMultiplier() {
        return minWagerMultiplier;
    }

    public void setMinWagerMultiplier(Long minWagerMultiplier) {
        this.minWagerMultiplier = minWagerMultiplier;
    }

    public Long getMaxWagerMultiplier() {
        return maxWagerMultiplier;
    }

    public void setMaxWagerMultiplier(Long maxWagerMultiplier) {
        this.maxWagerMultiplier = maxWagerMultiplier;
    }

    public int getMinBoards() {
        return minBoards;
    }

    public void setMinBoards(int minBoards) {
        this.minBoards = minBoards;
    }

    public int getMaxBoards() {
        return maxBoards;
    }

    public void setMaxBoards(int maxBoards) {
        this.maxBoards = maxBoards;
    }

    public Long getMinColumns() {
        return minColumns;
    }

    public void setMinColumns(Long minColumns) {
        this.minColumns = minColumns;
    }

    public Long getMaxColumns() {
        return maxColumns;
    }

    public void setMaxColumns(Long maxColumns) {
        this.maxColumns = maxColumns;
    }

    public Long getMinBoardMultiplier() {
        return minBoardMultiplier;
    }

    public void setMinBoardMultiplier(Long minBoardMultiplier) {
        this.minBoardMultiplier = minBoardMultiplier;
    }

    public Long getMaxBoardMultiplier() {
        return maxBoardMultiplier;
    }

    public void setMaxBoardMultiplier(Long maxBoardMultiplier) {
        this.maxBoardMultiplier = maxBoardMultiplier;
    }

    public Object getAddonsLimits() {
        return addonsLimits;
    }

    public void setAddonsLimits(Object addonsLimits) {
        this.addonsLimits = addonsLimits;
    }

}
