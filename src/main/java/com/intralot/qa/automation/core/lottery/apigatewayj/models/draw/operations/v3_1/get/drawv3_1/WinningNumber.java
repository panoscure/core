
package com.intralot.qa.automation.core.lottery.apigatewayj.models.draw.operations.v3_1.get.drawv3_1;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
