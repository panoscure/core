
package com.intralot.qa.automation.core.lottery.apigatewayj.models.channelgames.getchannelrecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DrawLimits {

    @SerializedName("minAdvance")
    @Expose
    private Long minAdvance;
    @SerializedName("maxAdvance")
    @Expose
    private Long maxAdvance;
    @SerializedName("minConsecutive")
    @Expose
    private Long minConsecutive;
    @SerializedName("maxConsecutive")
    @Expose
    private int maxConsecutive;

    public Long getMinAdvance() {
        return minAdvance;
    }

    public void setMinAdvance(Long minAdvance) {
        this.minAdvance = minAdvance;
    }

    public Long getMaxAdvance() {
        return maxAdvance;
    }

    public void setMaxAdvance(Long maxAdvance) {
        this.maxAdvance = maxAdvance;
    }

    public Long getMinConsecutive() {
        return minConsecutive;
    }

    public void setMinConsecutive(Long minConsecutive) {
        this.minConsecutive = minConsecutive;
    }

    public int getMaxConsecutive() {
        return maxConsecutive;
    }

    public void setMaxConsecutive(int maxConsecutive) {
        this.maxConsecutive = maxConsecutive;
    }

}
