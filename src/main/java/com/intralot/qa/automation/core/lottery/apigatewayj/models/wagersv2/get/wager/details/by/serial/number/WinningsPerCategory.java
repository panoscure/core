package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagersv2.get.wager.details.by.serial.number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WinningsPerCategory {

    @SerializedName("categoryAmounts")
    @Expose
    private CategoryAmounts categoryAmounts;

    public CategoryAmounts getCategoryAmounts() {
        return categoryAmounts;
    }

    public void setCategoryAmounts(CategoryAmounts categoryAmounts) {
        this.categoryAmounts = categoryAmounts;
    }

}
