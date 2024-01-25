
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WinningColumn {

    @SerializedName("entries")
    @Expose
    private Long entries;
    @SerializedName("winningColumnsDetails")
    @Expose
    private List<WinningColumnsDetail> winningColumnsDetails = null;

    public Long getEntries() {
        return entries;
    }

    public void setEntries(Long entries) {
        this.entries = entries;
    }

    public List<WinningColumnsDetail> getWinningColumnsDetails() {
        return winningColumnsDetails;
    }

    public void setWinningColumnsDetails(List<WinningColumnsDetail> winningColumnsDetails) {
        this.winningColumnsDetails = winningColumnsDetails;
    }

}

