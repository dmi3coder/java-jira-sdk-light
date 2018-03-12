
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
    "name",
    "key",
    "accountId",
    "emailAddress",
    "avatarUrls",
    "displayName",
    "active",
    "timeZone"
})
public class Creator implements Serializable
{

    @JsonProperty("self")
    private String self;
    @JsonProperty("name")
    private String name;
    @JsonProperty("key")
    private String key;
    @JsonProperty("accountId")
    private String accountId;
    @JsonProperty("emailAddress")
    private String emailAddress;
    @JsonProperty("avatarUrls")
    @Valid
    private AvatarUrls_ avatarUrls;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6669840328254387982L;

    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    public Creator withSelf(String self) {
        this.self = self;
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

    public Creator withName(String name) {
        this.name = name;
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

    public Creator withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Creator withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Creator withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @JsonProperty("avatarUrls")
    public AvatarUrls_ getAvatarUrls() {
        return avatarUrls;
    }

    @JsonProperty("avatarUrls")
    public void setAvatarUrls(AvatarUrls_ avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    public Creator withAvatarUrls(AvatarUrls_ avatarUrls) {
        this.avatarUrls = avatarUrls;
        return this;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Creator withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    public Creator withActive(Boolean active) {
        this.active = active;
        return this;
    }

    @JsonProperty("timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Creator withTimeZone(String timeZone) {
        this.timeZone = timeZone;
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

    public Creator withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("self", self).append("name", name).append("key", key).append("accountId", accountId).append("emailAddress", emailAddress).append("avatarUrls", avatarUrls).append("displayName", displayName).append("active", active).append("timeZone", timeZone).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountId).append(additionalProperties).append(name).append(active).append(emailAddress).append(timeZone).append(self).append(displayName).append(avatarUrls).append(key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Creator) == false) {
            return false;
        }
        Creator rhs = ((Creator) other);
        return new EqualsBuilder().append(accountId, rhs.accountId).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(active, rhs.active).append(emailAddress, rhs.emailAddress).append(timeZone, rhs.timeZone).append(self, rhs.self).append(displayName, rhs.displayName).append(avatarUrls, rhs.avatarUrls).append(key, rhs.key).isEquals();
    }

}
