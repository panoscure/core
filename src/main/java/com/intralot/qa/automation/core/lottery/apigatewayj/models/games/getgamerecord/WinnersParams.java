
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WinnersParams {

    @SerializedName("highLimit")
    @Expose
    private Long highLimit;
    @SerializedName("salesPool")
    @Expose
    private List<SalesPool> salesPool = null;
    @SerializedName("dvdRoundingParams")
    @Expose
    private DvdRoundingParams dvdRoundingParams;
    @SerializedName("dsbRoundingParams")
    @Expose
    private DsbRoundingParams dsbRoundingParams;
    @SerializedName("validationDeadlines")
    @Expose
    private List<ValidationDeadline> validationDeadlines = null;
    @SerializedName("validationRoundingParams")
    @Expose
    private ValidationRoundingParams validationRoundingParams;

    public Long getHighLimit() {
        return highLimit;
    }

    public void setHighLimit(Long highLimit) {
        this.highLimit = highLimit;
    }

    public List<SalesPool> getSalesPool() {
        return salesPool;
    }

    public void setSalesPool(List<SalesPool> salesPool) {
        this.salesPool = salesPool;
    }

    public DvdRoundingParams getDvdRoundingParams() {
        return dvdRoundingParams;
    }

    public void setDvdRoundingParams(DvdRoundingParams dvdRoundingParams) {
        this.dvdRoundingParams = dvdRoundingParams;
    }

    public DsbRoundingParams getDsbRoundingParams() {
        return dsbRoundingParams;
    }

    public void setDsbRoundingParams(DsbRoundingParams dsbRoundingParams) {
        this.dsbRoundingParams = dsbRoundingParams;
    }

    public List<ValidationDeadline> getValidationDeadlines() {
        return validationDeadlines;
    }

    public void setValidationDeadlines(List<ValidationDeadline> validationDeadlines) {
        this.validationDeadlines = validationDeadlines;
    }

    public ValidationRoundingParams getValidationRoundingParams() {
        return validationRoundingParams;
    }

    public void setValidationRoundingParams(ValidationRoundingParams validationRoundingParams) {
        this.validationRoundingParams = validationRoundingParams;
    }

}
