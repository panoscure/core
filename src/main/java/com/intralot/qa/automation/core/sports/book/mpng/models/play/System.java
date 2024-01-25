package com.intralot.qa.automation.core.sports.book.mpng.models.play;

import java.math.BigDecimal;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class System {

    @SerializedName("systems")
    @Expose
    private List<System__1> systems = null;
    @SerializedName("totalColumns")
    @Expose
    private Integer totalColumns;
    @SerializedName("totalCost")
    @Expose
    private BigDecimal totalCost;
    @SerializedName("winnings")
    @Expose
    private BigDecimal winnings;
    @SerializedName("bonusWinnings")
    @Expose
    private BigDecimal bonusWinnings;
    @SerializedName("systemsSelected")
    @Expose
    private List<Integer> systemsSelected = null;

    public List<System__1> getSystems() {
        return systems;
    }

    public void setSystems(List<System__1> systems) {
        this.systems = systems;
    }

    public Integer getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(Integer totalColumns) {
        this.totalColumns = totalColumns;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getWinnings() {
        return winnings;
    }

    public void setWinnings(BigDecimal winnings) {
        this.winnings = winnings;
    }

    public BigDecimal getBonusWinnings() {
        return bonusWinnings;
    }

    public void setBonusWinnings(BigDecimal bonusWinnings) {
        this.bonusWinnings = bonusWinnings;
    }

    public List<Integer> getSystemsSelected() {
        return systemsSelected;
    }

    public void setSystemsSelected(List<Integer> systemsSelected) {
        this.systemsSelected = systemsSelected;
    }

}