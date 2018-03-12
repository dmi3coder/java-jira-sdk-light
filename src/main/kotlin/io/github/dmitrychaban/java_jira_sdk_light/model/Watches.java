
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
    "watchCount",
    "isWatching"
})
public class Watches implements Serializable
{

    @JsonProperty("self")
    private String self;
    @JsonProperty("watchCount")
    private Integer watchCount;
    @JsonProperty("isWatching")
    private Boolean isWatching;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3659255831103175281L;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    public Watches withSelf(String self) {
        this.self = self;
        return this;
    }

    @JsonProperty("watchCount")
    public Integer getWatchCount() {
        return watchCount;
    }

    @JsonProperty("watchCount")
    public void setWatchCount(Integer watchCount) {
        this.watchCount = watchCount;
    }

    public Watches withWatchCount(Integer watchCount) {
        this.watchCount = watchCount;
        return this;
    }

    @JsonProperty("isWatching")
    public Boolean getIsWatching() {
        return isWatching;
    }

    @JsonProperty("isWatching")
    public void setIsWatching(Boolean isWatching) {
        this.isWatching = isWatching;
    }

    public Watches withIsWatching(Boolean isWatching) {
        this.isWatching = isWatching;
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

    public Watches withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("self", self).append("watchCount", watchCount).append("isWatching", isWatching).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(watchCount).append(isWatching).append(self).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Watches) == false) {
            return false;
        }
        Watches rhs = ((Watches) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(watchCount, rhs.watchCount).append(isWatching, rhs.isWatching).append(self, rhs.self).isEquals();
    }

}
