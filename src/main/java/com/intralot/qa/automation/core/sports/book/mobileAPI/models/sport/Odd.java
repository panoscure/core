package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sport;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Odd {
    @SerializedName("short")
    @Expose
    private String _short;
    @SerializedName("clean")
    @Expose
    private String clean;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("odd")
    @Expose
    private Double odd;
    @SerializedName("handicap")
    @Expose
    private String handicap;
    @SerializedName("displayed")
    @Expose
    private Boolean displayed;
    @SerializedName("marketId")
    @Expose
    private String marketId;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("row")
    @Expose
    private Integer row;
    @SerializedName("col")
    @Expose
    private Integer col;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("result")
    @Expose
    private Object result;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("commentExt")
    @Expose
    private String commentExt;
    @SerializedName("displayComment")
    @Expose
    private String displayComment;
    @SerializedName("updated")
    @Expose
    private Boolean updated;

    public String getShort() {
        return _short;
    }

    public void setShort(String _short) {
        this._short = _short;
    }

    public String getClean() {
        return clean;
    }

    public void setClean(String clean) {
        this.clean = clean;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getOdd() {
        return odd;
    }

    public void setOdd(Double odd) {
        this.odd = odd;
    }

    public String getHandicap() {
        return handicap;
    }

    public void setHandicap(String handicap) {
        this.handicap = handicap;
    }

    public Boolean getDisplayed() {
        return displayed;
    }

    public void setDisplayed(Boolean displayed) {
        this.displayed = displayed;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommentExt() {
        return commentExt;
    }

    public void setCommentExt(String commentExt) {
        this.commentExt = commentExt;
    }

    public String getDisplayComment() {
        return displayComment;
    }

    public void setDisplayComment(String displayComment) {
        this.displayComment = displayComment;
    }

    public Boolean getUpdated() {
        return updated;
    }

    public void setUpdated(Boolean updated) {
        this.updated = updated;
    }
}
