
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet.AdditionalProp1;
import com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet.AdditionalProp2;
import com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet.AdditionalProp3;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FreeBet {

    @SerializedName("additionalProp1")
    @Expose
    private AdditionalProp1 additionalProp1;
    @SerializedName("additionalProp2")
    @Expose
    private AdditionalProp2 additionalProp2;
    @SerializedName("additionalProp3")
    @Expose
    private AdditionalProp3 additionalProp3;

    public AdditionalProp1 getAdditionalProp1() {
        return additionalProp1;
    }

    public void setAdditionalProp1(AdditionalProp1 additionalProp1) {
        this.additionalProp1 = additionalProp1;
    }

    public FreeBet withAdditionalProp1(AdditionalProp1 additionalProp1) {
        this.additionalProp1 = additionalProp1;
        return this;
    }

    public AdditionalProp2 getAdditionalProp2() {
        return additionalProp2;
    }

    public void setAdditionalProp2(AdditionalProp2 additionalProp2) {
        this.additionalProp2 = additionalProp2;
    }

    public FreeBet withAdditionalProp2(AdditionalProp2 additionalProp2) {
        this.additionalProp2 = additionalProp2;
        return this;
    }

    public AdditionalProp3 getAdditionalProp3() {
        return additionalProp3;
    }

    public void setAdditionalProp3(AdditionalProp3 additionalProp3) {
        this.additionalProp3 = additionalProp3;
    }

    public FreeBet withAdditionalProp3(AdditionalProp3 additionalProp3) {
        this.additionalProp3 = additionalProp3;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("additionalProp1", additionalProp1).append("additionalProp2", additionalProp2).append("additionalProp3", additionalProp3).toString();
    }

}
