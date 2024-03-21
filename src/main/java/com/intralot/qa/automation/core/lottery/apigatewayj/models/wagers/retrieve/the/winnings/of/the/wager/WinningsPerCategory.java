
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.retrieve.the.winnings.of.the.wager;

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
    private int categoryId;
    @SerializedName("boardId")
    @Expose
    private int boardId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("subCategoryId")
    @Expose
    private Integer subCategoryId;
    @SerializedName("successes")
    @Expose
    private int successes;
    @SerializedName("gameTypeId")
    @Expose
    private Integer gameTypeId;
    @SerializedName("betTypeId")
    @Expose
    private Integer betTypeId;

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

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public Integer getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Integer subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSuccesses() {
        return successes;
    }

    public void setSuccesses(int successes) {
        this.successes = successes;
    }

    public Integer getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(Integer gameTypeId) {
        this.gameTypeId = gameTypeId;
    }

    public Integer getBetTypeId() {
        return betTypeId;
    }
    public void setBetTypeId(Integer betTypeId) {
        this.betTypeId = betTypeId;
    }
}
