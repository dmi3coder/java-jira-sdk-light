
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
    "description",
    "iconUrl",
    "name",
    "id",
    "statusCategory"
})
public class Status implements Serializable
{

    @JsonProperty("self")
    private String self;
    @JsonProperty("description")
    private String description;
    @JsonProperty("iconUrl")
    private String iconUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;
    @JsonProperty("statusCategory")
    @Valid
    private StatusCategory statusCategory;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2969470846569979816L;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    public Status withSelf(String self) {
        this.self = self;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Status withDescription(String description) {
        this.description = description;
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

    public Status withIconUrl(String iconUrl) {
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

    public Status withName(String name) {
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

    public Status withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("statusCategory")
    public StatusCategory getStatusCategory() {
        return statusCategory;
    }

    @JsonProperty("statusCategory")
    public void setStatusCategory(StatusCategory statusCategory) {
        this.statusCategory = statusCategory;
    }

    public Status withStatusCategory(StatusCategory statusCategory) {
        this.statusCategory = statusCategory;
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

    public Status withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("self", self).append("description", description).append("iconUrl", iconUrl).append("name", name).append("id", id).append("statusCategory", statusCategory).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(additionalProperties).append(description).append(name).append(iconUrl).append(statusCategory).append(self).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Status) == false) {
            return false;
        }
        Status rhs = ((Status) other);
        return new EqualsBuilder().append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(description, rhs.description).append(name, rhs.name).append(iconUrl, rhs.iconUrl).append(statusCategory, rhs.statusCategory).append(self, rhs.self).isEquals();
    }

}
