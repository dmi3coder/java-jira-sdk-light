
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
    "name",
    "archived",
    "released",
    "releaseDate"
})
public class FixVersion implements Serializable
{

    @JsonProperty("self")
    private String self;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("released")
    private Boolean released;
    @JsonProperty("releaseDate")
    private String releaseDate;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2626344732673655794L;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    public FixVersion withSelf(String self) {
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

    public FixVersion withId(String id) {
        this.id = id;
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

    public FixVersion withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public FixVersion withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    @JsonProperty("released")
    public Boolean getReleased() {
        return released;
    }

    @JsonProperty("released")
    public void setReleased(Boolean released) {
        this.released = released;
    }

    public FixVersion withReleased(Boolean released) {
        this.released = released;
        return this;
    }

    @JsonProperty("releaseDate")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("releaseDate")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public FixVersion withReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
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

    public FixVersion withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("self", self).append("id", id).append("name", name).append("archived", archived).append("released", released).append("releaseDate", releaseDate).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(released).append(id).append(releaseDate).append(archived).append(additionalProperties).append(name).append(self).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FixVersion) == false) {
            return false;
        }
        FixVersion rhs = ((FixVersion) other);
        return new EqualsBuilder().append(released, rhs.released).append(id, rhs.id).append(releaseDate, rhs.releaseDate).append(archived, rhs.archived).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(self, rhs.self).isEquals();
    }

}
