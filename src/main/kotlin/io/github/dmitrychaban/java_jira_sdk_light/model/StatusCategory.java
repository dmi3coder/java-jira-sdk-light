
package io.github.dmitrychaban.java_jira_sdk_light.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "self",
    "id",
    "key",
    "colorName",
    "name"
})
public class StatusCategory implements Serializable
{

    @JsonProperty("self")
    private String self;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("colorName")
    private String colorName;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2087746522496718940L;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    public StatusCategory withSelf(String self) {
        this.self = self;
        return this;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public StatusCategory withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public StatusCategory withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("colorName")
    public String getColorName() {
        return colorName;
    }

    @JsonProperty("colorName")
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public StatusCategory withColorName(String colorName) {
        this.colorName = colorName;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public StatusCategory withName(String name) {
        this.name = name;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public StatusCategory withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("self", self).append("id", id).append("key", key).append("colorName", colorName).append("name", name).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(colorName).append(additionalProperties).append(name).append(self).append(key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatusCategory) == false) {
            return false;
        }
        StatusCategory rhs = ((StatusCategory) other);
        return new EqualsBuilder().append(id, rhs.id).append(colorName, rhs.colorName).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(self, rhs.self).append(key, rhs.key).isEquals();
    }

}
