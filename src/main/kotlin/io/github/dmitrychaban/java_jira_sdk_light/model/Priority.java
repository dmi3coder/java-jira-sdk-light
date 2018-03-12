
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
    "iconUrl",
    "name",
    "id"
})
public class Priority implements Serializable
{

    @JsonProperty("self")
    private String self;
    @JsonProperty("iconUrl")
    private String iconUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8164845740226817892L;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    public Priority withSelf(String self) {
        this.self = self;
        return this;
    }

    @JsonProperty("iconUrl")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("iconUrl")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Priority withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
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

    public Priority withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Priority withId(String id) {
        this.id = id;
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

    public Priority withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("self", self).append("iconUrl", iconUrl).append("name", name).append("id", id).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(additionalProperties).append(name).append(iconUrl).append(self).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Priority) == false) {
            return false;
        }
        Priority rhs = ((Priority) other);
        return new EqualsBuilder().append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(iconUrl, rhs.iconUrl).append(self, rhs.self).isEquals();
    }

}
