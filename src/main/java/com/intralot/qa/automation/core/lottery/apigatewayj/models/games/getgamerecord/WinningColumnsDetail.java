
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WinningColumnsDetail {

    @SerializedName("length")
    @Expose
    private Long length;
    @SerializedName("minNumber")
    @Expose
    private Long minNumber;
    @SerializedName("maxNumber")
    @Expose
    private Long maxNumber;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("unique")
    @Expose
    private Boolean unique;
    @SerializedName("hasBonus")
    @Expose
    private Boolean hasBonus;
    @SerializedName("sourceId")
    @Expose
    private Long sourceId;
    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("type")
    @Expose
    private Long type;
    @SerializedName("distinctValues")
    @Expose
    private Object distinctValues;

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getMinNumber() {
        return minNumber;
    }

    public void setMinNumber(Long minNumber) {
        this.minNumber = minNumber;
    }

    public Long getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Long maxNumber) {
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

    public Boolean getHasBonus() {
        return hasBonus;
    }

    public void setHasBonus(Boolean hasBonus) {
        this.hasBonus = hasBonus;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Object getDistinctValues() {
        return distinctValues;
    }

    public void setDistinctValues(Object distinctValues) {
        this.distinctValues = distinctValues;
    }

}
