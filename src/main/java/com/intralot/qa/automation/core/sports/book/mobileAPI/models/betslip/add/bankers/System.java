package com.intralot.qa.automation.core.sports.book.mobileAPI.models.betslip.add.bankers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class System {

    @SerializedName("systems")
    @Expose
    private List<System_> systems = null;
    @SerializedName("totalColumns")
    @Expose
    private Integer totalColumns;
    @SerializedName("totalCost")
    @Expose
    private Double totalCost;
    @SerializedName("winnings")
    @Expose
    private Double winnings;
    @SerializedName("bonusWinnings")
    @Expose
    private Double bonusWinnings;
    @SerializedName("systemsSelected")
    @Expose
    private List<Object> systemsSelected = null;

    public List<System_> getSystems() {
        return systems;
    }

    public void setSystems(List<System_> systems) {
        this.systems = systems;
    }

    public Integer getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(Integer totalColumns) {
        this.totalColumns = totalColumns;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getWinnings() {
        return winnings;
    }

    public void setWinnings(Double winnings) {
        this.winnings = winnings;
    }

    public Double getBonusWinnings() {
        return bonusWinnings;
    }

    public void setBonusWinnings(Double bonusWinnings) {
        this.bonusWinnings = bonusWinnings;
    }

    public List<Object> getSystemsSelected() {
        return systemsSelected;
    }

    public void setSystemsSelected(List<Object> systemsSelected) {
        this.systemsSelected = systemsSelected;
    }


}
