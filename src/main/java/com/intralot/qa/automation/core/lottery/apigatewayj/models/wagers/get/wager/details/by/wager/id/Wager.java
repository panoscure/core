
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "dbg"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wager {

    @JsonProperty("dbg")
    private List<Dbg> dbg;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("dbg")
    public List<Dbg> getDbg() {
        return dbg;
    }

    @JsonProperty("dbg")
    public void setDbg(List<Dbg> dbg) {
        this.dbg = dbg;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
