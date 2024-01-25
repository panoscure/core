
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.an.event.by.code;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Selection {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("names")
    @Expose
    private Names___ names;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("odd")
    @Expose
    private Odd odd;
    @SerializedName("sts")
    @Expose
    private String sts;
    @SerializedName("displayed")
    @Expose
    private Boolean displayed;
    @SerializedName("pos")
    @Expose
    private Pos pos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Names___ getNames() {
        return names;
    }

    public void setNames(Names___ names) {
        this.names = names;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Odd getOdd() {
        return odd;
    }

    public void setOdd(Odd odd) {
        this.odd = odd;
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public Boolean getDisplayed() {
        return displayed;
    }

    public void setDisplayed(Boolean displayed) {
        this.displayed = displayed;
    }

    public Pos getPos() {
        return pos;
    }

    public void setPos(Pos pos) {
        this.pos = pos;
    }

}
