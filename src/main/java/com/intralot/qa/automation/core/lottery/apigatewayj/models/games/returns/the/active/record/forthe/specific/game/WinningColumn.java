package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WinningColumn {

    @SerializedName("entries")
    @Expose
    private Integer entries;
    @SerializedName("winningColumnsDetails")
    @Expose
    private List<WinningColumnsDetail> winningColumnsDetails = null;

    public Integer getEntries() {
        return entries;
    }

    public void setEntries(Integer entries) {
        this.entries = entries;
    }

    public List<WinningColumnsDetail> getWinningColumnsDetails() {
        return winningColumnsDetails;
    }

    public void setWinningColumnsDetails(List<WinningColumnsDetail> winningColumnsDetails) {
        this.winningColumnsDetails = winningColumnsDetails;
    }

}
