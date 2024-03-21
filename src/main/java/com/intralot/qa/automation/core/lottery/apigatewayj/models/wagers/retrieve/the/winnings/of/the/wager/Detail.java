
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.retrieve.the.winnings.of.the.wager;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Detail {

    @SerializedName("detailAmounts")
    @Expose
    private DetailAmounts detailAmounts;
    @SerializedName("draw")
    @Expose
    private Integer draw;
    @SerializedName("purgeTime")
    @Expose
    private BigInteger purgeTime;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("winningsPerCategory")
    @Expose
    private List<WinningsPerCategory> winningsPerCategory = null;

    public DetailAmounts getDetailAmounts() {
        return detailAmounts;
    }

    public void setDetailAmounts(DetailAmounts detailAmounts) {
        this.detailAmounts = detailAmounts;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public BigInteger getPurgeTime() {
        return purgeTime;
    }

    public void setPurgeTime(BigInteger purgeTime) {
        this.purgeTime = purgeTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<WinningsPerCategory> getWinningsPerCategory() {
        return winningsPerCategory;
    }

    public void setWinningsPerCategory(List<WinningsPerCategory> winningsPerCategory) {
        this.winningsPerCategory = winningsPerCategory;
    }

}
