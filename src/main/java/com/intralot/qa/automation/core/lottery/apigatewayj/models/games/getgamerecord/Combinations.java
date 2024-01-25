
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Combinations {

    @SerializedName("isEnabled")
    @Expose
    private Boolean isEnabled;
    @SerializedName("minBoards")
    @Expose
    private Integer minBoards;
    @SerializedName("maxBoards")
    @Expose
    private Integer maxBoards;

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Integer getMinBoards() {
        return minBoards;
    }

    public void setMinBoards(Integer minBoards) {
        this.minBoards = minBoards;
    }

    public Integer getMaxBoards() {
        return maxBoards;
    }

    public void setMaxBoards(Integer maxBoards) {
        this.maxBoards = maxBoards;
    }

}
