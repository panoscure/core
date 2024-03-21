
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WinningsPerCategory {

    @SerializedName("categoryAmounts")
    @Expose
    private CategoryAmounts categoryAmounts;
    @SerializedName("categoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("boardId")
    @Expose
    private Integer boardId;
    @SerializedName("subCategoryId")
    @Expose
    private Integer subCategoryId;
    @SerializedName("successes")
    @Expose
    private Integer successes;
    @SerializedName("gameTypeId")
    @Expose
    private Integer gameTypeId;
    @SerializedName("gift")
    @Expose
    private Gift gift;
    @SerializedName("promoId")
    @Expose
    private Integer promoId;

    public CategoryAmounts getCategoryAmounts() {
        return categoryAmounts;
    }

    public void setCategoryAmounts(CategoryAmounts categoryAmounts) {
        this.categoryAmounts = categoryAmounts;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
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

    public Integer getPromoId() {
        return promoId;
    }

    public void setPromoId(Integer promoId) {
        this.promoId = promoId;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }
}
