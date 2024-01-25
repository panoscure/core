package com.intralot.qa.automation.core.sports.book.mobileAPI.models.schedule;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.sports.book.mobileAPI.models.sportsbook.prematch.event.list.Event;

public class ScheduleEvent {

    @SerializedName("event")
    @Expose
    private Event event;
    @SerializedName("availableVideo")
    @Expose
    private Boolean availableVideo;
    @SerializedName("availableAudio")
    @Expose
    private Boolean availableAudio;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Boolean getAvailableVideo() {
        return availableVideo;
    }

    public void setAvailableVideo(Boolean availableVideo) {
        this.availableVideo = availableVideo;
    }

    public Boolean getAvailableAudio() {
        return availableAudio;
    }

    public void setAvailableAudio(Boolean availableAudio) {
        this.availableAudio = availableAudio;
    }

}

