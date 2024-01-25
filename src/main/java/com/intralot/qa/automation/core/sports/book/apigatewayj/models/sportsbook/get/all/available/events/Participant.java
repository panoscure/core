
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.all.available.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Objects;

public class Participant implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("names")
    @Expose
    private Names_ names;
    private final static long serialVersionUID = -6014376531427220961L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Participant() {
    }

    /**
     * 
     * @param id
     * @param names
     * @param name
     * @param type
     */
    public Participant(String id, String name, String type, Names_ names) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
        this.names = names;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Names_ getNames() {
        return names;
    }

    public void setNames(Names_ names) {
        this.names = names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return names.equals(that.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(names);
    }
}
