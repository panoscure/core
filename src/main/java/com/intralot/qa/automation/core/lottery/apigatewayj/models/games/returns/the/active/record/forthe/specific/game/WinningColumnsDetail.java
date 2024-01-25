package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WinningColumnsDetail {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("length")
    @Expose
    private Integer length;
    @SerializedName("minNumber")
    @Expose
    private Integer minNumber;
    @SerializedName("maxNumber")
    @Expose
    private Integer maxNumber;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("unique")
    @Expose
    private Boolean unique;
    @SerializedName("distinctValues")
    @Expose
    private Object distinctValues;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("hasBonus")
    @Expose
    private Boolean hasBonus;
    @SerializedName("sourceId")
    @Expose
    private Integer sourceId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(Integer minNumber) {
        this.minNumber = minNumber;
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Boolean getUnique() {
        return unique;
    }

    public void setUnique(Boolean unique) {
        this.unique = unique;
    }

    public Object getDistinctValues() {
        return distinctValues;
    }

    public void setDistinctValues(Object distinctValues) {
        this.distinctValues = distinctValues;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getHasBonus() {
        return hasBonus;
    }

    public void setHasBonus(Boolean hasBonus) {
        this.hasBonus = hasBonus;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

}
