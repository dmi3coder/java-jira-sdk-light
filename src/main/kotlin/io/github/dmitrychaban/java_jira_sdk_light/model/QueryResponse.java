
package io.github.dmitrychaban.java_jira_sdk_light.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
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
    "expand",
    "startAt",
    "maxResults",
    "total",
    "issues"
})
public class QueryResponse implements Serializable
{

    @JsonProperty("expand")
    private String expand;
    @JsonProperty("startAt")
    private Integer startAt;
    @JsonProperty("maxResults")
    private Integer maxResults;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("issues")
    @Valid
    private List<Issue> issues = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6976367222544563802L;

    @JsonProperty("expand")
    public String getExpand() {
        return expand;
    }

    @JsonProperty("expand")
    public void setExpand(String expand) {
        this.expand = expand;
    }

    public QueryResponse withExpand(String expand) {
        this.expand = expand;
        return this;
    }

    @JsonProperty("startAt")
    public Integer getStartAt() {
        return startAt;
    }

    @JsonProperty("startAt")
    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    public QueryResponse withStartAt(Integer startAt) {
        this.startAt = startAt;
        return this;
    }

    @JsonProperty("maxResults")
    public Integer getMaxResults() {
        return maxResults;
    }

    @JsonProperty("maxResults")
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    public QueryResponse withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public QueryResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    @JsonProperty("issues")
    public List<Issue> getIssues() {
        return issues;
    }

    @JsonProperty("issues")
    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public QueryResponse withIssues(List<Issue> issues) {
        this.issues = issues;
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

    public QueryResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("expand", expand).append("startAt", startAt).append("maxResults", maxResults).append("total", total).append("issues", issues).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(total).append(additionalProperties).append(issues).append(expand).append(startAt).append(maxResults).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QueryResponse) == false) {
            return false;
        }
        QueryResponse rhs = ((QueryResponse) other);
        return new EqualsBuilder().append(total, rhs.total).append(additionalProperties, rhs.additionalProperties).append(issues, rhs.issues).append(expand, rhs.expand).append(startAt, rhs.startAt).append(maxResults, rhs.maxResults).isEquals();
    }

}
