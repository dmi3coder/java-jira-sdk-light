
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
    "description",
    "iconUrl",
    "name",
    "subtask"
})
public class Issuetype implements Serializable
{

    @JsonProperty("self")
    private String self;
    @JsonProperty("id")
    private String id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("iconUrl")
    private String iconUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("subtask")
    private Boolean subtask;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4252319880216835637L;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    public Issuetype withSelf(String self) {
        this.self = self;
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

    public Issuetype withId(String id) {
        this.id = id;
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

    public Issuetype withDescription(String description) {
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

    public Issuetype withIconUrl(String iconUrl) {
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

    public Issuetype withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("subtask")
    public Boolean getSubtask() {
        return subtask;
    }

    @JsonProperty("subtask")
    public void setSubtask(Boolean subtask) {
        this.subtask = subtask;
    }

    public Issuetype withSubtask(Boolean subtask) {
        this.subtask = subtask;
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

    public Issuetype withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("self", self).append("id", id).append("description", description).append("iconUrl", iconUrl).append("name", name).append("subtask", subtask).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subtask).append(id).append(additionalProperties).append(description).append(name).append(iconUrl).append(self).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Issuetype) == false) {
            return false;
        }
        Issuetype rhs = ((Issuetype) other);
        return new EqualsBuilder().append(subtask, rhs.subtask).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(description, rhs.description).append(name, rhs.name).append(iconUrl, rhs.iconUrl).append(self, rhs.self).isEquals();
    }

}
