
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
    "expand",
    "self",
    "id",
    "key",
    "name",
    "avatarUrls",
    "projectTypeKey",
    "simplified"
})
public class JiraProject implements Serializable
{

    @JsonProperty("expand")
    private String expand;
    @JsonProperty("self")
    private String self;
    @JsonProperty("id")
    private String id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("name")
    private String name;
    @JsonProperty("avatarUrls")
    @Valid
    private AvatarUrls avatarUrls;
    @JsonProperty("projectTypeKey")
    private String projectTypeKey;
    @JsonProperty("simplified")
    private Boolean simplified;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7471478880158007242L;

    @JsonProperty("expand")
    public String getExpand() {
        return expand;
    }

    @JsonProperty("expand")
    public void setExpand(String expand) {
        this.expand = expand;
    }

    public JiraProject withExpand(String expand) {
        this.expand = expand;
        return this;
    }

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    public JiraProject withSelf(String self) {
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

    public JiraProject withId(String id) {
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

    public JiraProject withKey(String key) {
        this.key = key;
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

    public JiraProject withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("avatarUrls")
    public AvatarUrls getAvatarUrls() {
        return avatarUrls;
    }

    @JsonProperty("avatarUrls")
    public void setAvatarUrls(AvatarUrls avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    public JiraProject withAvatarUrls(AvatarUrls avatarUrls) {
        this.avatarUrls = avatarUrls;
        return this;
    }

    @JsonProperty("projectTypeKey")
    public String getProjectTypeKey() {
        return projectTypeKey;
    }

    @JsonProperty("projectTypeKey")
    public void setProjectTypeKey(String projectTypeKey) {
        this.projectTypeKey = projectTypeKey;
    }

    public JiraProject withProjectTypeKey(String projectTypeKey) {
        this.projectTypeKey = projectTypeKey;
        return this;
    }

    @JsonProperty("simplified")
    public Boolean getSimplified() {
        return simplified;
    }

    @JsonProperty("simplified")
    public void setSimplified(Boolean simplified) {
        this.simplified = simplified;
    }

    public JiraProject withSimplified(Boolean simplified) {
        this.simplified = simplified;
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

    public JiraProject withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("expand", expand).append("self", self).append("id", id).append("key", key).append("name", name).append("avatarUrls", avatarUrls).append("projectTypeKey", projectTypeKey).append("simplified", simplified).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(projectTypeKey).append(id).append(additionalProperties).append(name).append(expand).append(self).append(avatarUrls).append(simplified).append(key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JiraProject) == false) {
            return false;
        }
        JiraProject rhs = ((JiraProject) other);
        return new EqualsBuilder().append(projectTypeKey, rhs.projectTypeKey).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(expand, rhs.expand).append(self, rhs.self).append(avatarUrls, rhs.avatarUrls).append(simplified, rhs.simplified).append(key, rhs.key).isEquals();
    }

}
