
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
    "votes",
    "hasVoted"
})
public class Votes implements Serializable
{

    @JsonProperty("self")
    private String self;
    @JsonProperty("votes")
    private Integer votes;
    @JsonProperty("hasVoted")
    private Boolean hasVoted;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2550706207928034265L;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    public Votes withSelf(String self) {
        this.self = self;
        return this;
    }

    @JsonProperty("votes")
    public Integer getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public Votes withVotes(Integer votes) {
        this.votes = votes;
        return this;
    }

    @JsonProperty("hasVoted")
    public Boolean getHasVoted() {
        return hasVoted;
    }

    @JsonProperty("hasVoted")
    public void setHasVoted(Boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    public Votes withHasVoted(Boolean hasVoted) {
        this.hasVoted = hasVoted;
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

    public Votes withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("self", self).append("votes", votes).append("hasVoted", hasVoted).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hasVoted).append(additionalProperties).append(votes).append(self).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Votes) == false) {
            return false;
        }
        Votes rhs = ((Votes) other);
        return new EqualsBuilder().append(hasVoted, rhs.hasVoted).append(additionalProperties, rhs.additionalProperties).append(votes, rhs.votes).append(self, rhs.self).isEquals();
    }

}
