
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SpecialOptions {

    @SerializedName("superSaturdayGap")
    @Expose
    private Integer superSaturdayGap;

    public Integer getSuperSaturdayGap() {
        return superSaturdayGap;
    }

    public void setSuperSaturdayGap(Integer superSaturdayGap) {
        this.superSaturdayGap = superSaturdayGap;
    }

    public SpecialOptions withSuperSaturdayGap(Integer superSaturdayGap) {
        this.superSaturdayGap = superSaturdayGap;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("superSaturdayGap", superSaturdayGap).toString();
    }

}
