
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ChildBetSummary {

    @SerializedName("selectionIds")
    @Expose
    private List<Integer> selectionIds = null;
    @SerializedName("displayStatus")
    @Expose
    private String displayStatus;
    @SerializedName("totalPrice")
    @Expose
    private Integer totalPrice;
    @SerializedName("payout")
    @Expose
    private Integer payout;

    public List<Integer> getSelectionIds() {
        return selectionIds;
    }

    public void setSelectionIds(List<Integer> selectionIds) {
        this.selectionIds = selectionIds;
    }

    public ChildBetSummary withSelectionIds(List<Integer> selectionIds) {
        this.selectionIds = selectionIds;
        return this;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public ChildBetSummary withDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ChildBetSummary withTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public Integer getPayout() {
        return payout;
    }

    public void setPayout(Integer payout) {
        this.payout = payout;
    }

    public ChildBetSummary withPayout(Integer payout) {
        this.payout = payout;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("selectionIds", selectionIds).append("displayStatus", displayStatus).append("totalPrice", totalPrice).append("payout", payout).toString();
    }

}
