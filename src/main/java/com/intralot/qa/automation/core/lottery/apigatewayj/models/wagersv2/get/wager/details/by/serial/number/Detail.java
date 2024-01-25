package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagersv2.get.wager.details.by.serial.number;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {

    @SerializedName("detailAmounts")
    @Expose
    private DetailAmounts detailAmounts;
    @SerializedName("draw")
    @Expose
    private Integer draw;
    @SerializedName("purgeTime")
    @Expose
    private Integer purgeTime;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("winningsPerCategory")
    @Expose
    private List<WinningsPerCategory> winningsPerCategory;

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

    public Integer getPurgeTime() {
        return purgeTime;
    }

    public void setPurgeTime(Integer purgeTime) {
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