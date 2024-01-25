package com.intralot.qa.automation.core.sports.book.mpng.models.play;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class System__1 {

    @SerializedName("name")
    @Expose
    private Integer name;
    @SerializedName("totalColumns")
    @Expose
    private Integer totalColumns;
    @SerializedName("amount")
    @Expose
    private Object amount;
    @SerializedName("systemName")
    @Expose
    private String systemName;
    @SerializedName("blocked")
    @Expose
    private Boolean blocked;
    @SerializedName("special")
    @Expose
    private Boolean special;
    @SerializedName("encodedName")
    @Expose
    private String encodedName;

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(Integer totalColumns) {
        this.totalColumns = totalColumns;
    }

    public Object getAmount() {
        return amount;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public Boolean getSpecial() {
        return special;
    }

    public void setSpecial(Boolean special) {
        this.special = special;
    }

    public String getEncodedName() {
        return encodedName;
    }

    public void setEncodedName(String encodedName) {
        this.encodedName = encodedName;
    }

}