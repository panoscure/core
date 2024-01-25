package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sport;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Sport {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("anteposts")
    @Expose
    private List<Antepost> anteposts = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Antepost> getAnteposts() {
        return anteposts;
    }

    public void setAnteposts(List<Antepost> anteposts) {
        this.anteposts = anteposts;
    }
}
