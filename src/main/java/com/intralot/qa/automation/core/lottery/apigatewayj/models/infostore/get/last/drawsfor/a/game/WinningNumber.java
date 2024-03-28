package com.intralot.qa.automation.core.lottery.apigatewayj.models.infostore.get.last.drawsfor.a.game;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
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
