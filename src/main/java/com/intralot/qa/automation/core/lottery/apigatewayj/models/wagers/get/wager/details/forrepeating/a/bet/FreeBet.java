
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public AdditionalProp2 getAdditionalProp2() {
        return additionalProp2;
    }

    public void setAdditionalProp2(AdditionalProp2 additionalProp2) {
        this.additionalProp2 = additionalProp2;
    }

    public AdditionalProp3 getAdditionalProp3() {
        return additionalProp3;
    }

    public void setAdditionalProp3(AdditionalProp3 additionalProp3) {
        this.additionalProp3 = additionalProp3;
    }

}
