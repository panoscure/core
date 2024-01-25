package com.intralot.qa.automation.core.sports.book.apigatewayj.models.l5.sportbook.wagers.overask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SelectionsPo {
    @SerializedName("row")
    @Expose
    private Integer row;
    @SerializedName("column")
    @Expose
    private Integer column;

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }
}