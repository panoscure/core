
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.games.ticket.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PreSellTicketsInRangeModel {

    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("ticketFrom")
    @Expose
    private TicketFrom ticketFrom;
    @SerializedName("ticketTo")
    @Expose
    private TicketTo ticketTo;
    @SerializedName("numberOfTickets")
    @Expose
    private Integer numberOfTickets;
    @SerializedName("totalAmounts")
    @Expose
    private TotalAmounts totalAmounts;
    @SerializedName("packAlreadySettled")
    @Expose
    private Boolean packAlreadySettled;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public TicketFrom getTicketFrom() {
        return ticketFrom;
    }

    public void setTicketFrom(TicketFrom ticketFrom) {
        this.ticketFrom = ticketFrom;
    }

    public TicketTo getTicketTo() {
        return ticketTo;
    }

    public void setTicketTo(TicketTo ticketTo) {
        this.ticketTo = ticketTo;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public TotalAmounts getTotalAmounts() {
        return totalAmounts;
    }

    public void setTotalAmounts(TotalAmounts totalAmounts) {
        this.totalAmounts = totalAmounts;
    }

    public Boolean getPackAlreadySettled() {
        return packAlreadySettled;
    }

    public void setPackAlreadySettled(Boolean packAlreadySettled) {
        this.packAlreadySettled = packAlreadySettled;
    }

}
