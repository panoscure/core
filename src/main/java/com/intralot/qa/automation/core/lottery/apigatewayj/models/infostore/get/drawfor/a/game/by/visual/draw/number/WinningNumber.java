package com.intralot.qa.automation.core.lottery.apigatewayj.models.infostore.get.drawfor.a.game.by.visual.draw.number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WinningNumber {

    @SerializedName("list")
    @Expose
    private List<Integer> list = null;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

}