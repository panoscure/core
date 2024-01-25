
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Area {

    @SerializedName("columns")
    @Expose
    private Integer columns;
    @SerializedName("index")
    @Expose
    private Integer index;
    @SerializedName("requested")
    @Expose
    private Integer requested;
    @SerializedName("required")
    @Expose
    private Integer required;
    @SerializedName("tableOfPositions")
    @Expose
    private List<TableOfPosition> tableOfPositions = null;

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getRequested() {
        return requested;
    }

    public void setRequested(Integer requested) {
        this.requested = requested;
    }

    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public List<TableOfPosition> getTableOfPositions() {
        return tableOfPositions;
    }

    public void setTableOfPositions(List<TableOfPosition> tableOfPositions) {
        this.tableOfPositions = tableOfPositions;
    }

}
