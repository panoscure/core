
package com.intralot.qa.automation.core.lottery.apigatewayj.models.game.operations.v1.getgames;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetGame {

    @SerializedName("gameStateId")
    @Expose
    private Integer gameStateId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("status")
    @Expose
    private Integer status;

    public Integer getGameStateId() {
        return gameStateId;
    }

    public void setGameStateId(Integer gameStateId) {
        this.gameStateId = gameStateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
