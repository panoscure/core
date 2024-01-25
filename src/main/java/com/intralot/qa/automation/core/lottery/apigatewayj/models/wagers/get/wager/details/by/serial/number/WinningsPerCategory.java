
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.serial.number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WinningsPerCategory {

    @SerializedName("categoryAmounts")
    @Expose
    private CategoryAmounts categoryAmounts;
    @SerializedName("categoryId")
    @Expose
    private int categoryId;
    @SerializedName("subCategoryId")
    @Expose
    private Integer subCategoryId;
    @SerializedName("successes")
    @Expose
    private Integer successes;
    @SerializedName("gameTypeId")
    @Expose
    private Integer gameTypeId;

    public CategoryAmounts getCategoryAmounts() {
        return categoryAmounts;
    }

    public void setCategoryAmounts(CategoryAmounts categoryAmounts) {
        this.categoryAmounts = categoryAmounts;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Integer getSuccesses() {
        return successes;
    }

    public void setSuccesses(Integer successes) {
        this.successes = successes;
    }

    public Integer getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(Integer gameTypeId) {
        this.gameTypeId = gameTypeId;
    }

}
