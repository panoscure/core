
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TableOfPosition {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("positions")
    @Expose
    //private List<Integer> positions = null;
    private List<String>  positions = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //public List<Integer> getPositions() {
        //return positions;
    //}

    //public void setPositions(List<Integer> positions) {
        //this.positions = positions;
    //}

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }

}
