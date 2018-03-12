
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
    "48x48",
    "24x24",
    "16x16",
    "32x32"
})
public class AvatarUrls implements Serializable
{

    @JsonProperty("48x48")
    private String _48x48;
    @JsonProperty("24x24")
    private String _24x24;
    @JsonProperty("16x16")
    private String _16x16;
    @JsonProperty("32x32")
    private String _32x32;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1603317173371383714L;

    @JsonProperty("48x48")
    public String get48x48() {
        return _48x48;
    }

    @JsonProperty("48x48")
    public void set48x48(String _48x48) {
        this._48x48 = _48x48;
    }

    public AvatarUrls with48x48(String _48x48) {
        this._48x48 = _48x48;
        return this;
    }

    @JsonProperty("24x24")
    public String get24x24() {
        return _24x24;
    }

    @JsonProperty("24x24")
    public void set24x24(String _24x24) {
        this._24x24 = _24x24;
    }

    public AvatarUrls with24x24(String _24x24) {
        this._24x24 = _24x24;
        return this;
    }

    @JsonProperty("16x16")
    public String get16x16() {
        return _16x16;
    }

    @JsonProperty("16x16")
    public void set16x16(String _16x16) {
        this._16x16 = _16x16;
    }

    public AvatarUrls with16x16(String _16x16) {
        this._16x16 = _16x16;
        return this;
    }

    @JsonProperty("32x32")
    public String get32x32() {
        return _32x32;
    }

    @JsonProperty("32x32")
    public void set32x32(String _32x32) {
        this._32x32 = _32x32;
    }

    public AvatarUrls with32x32(String _32x32) {
        this._32x32 = _32x32;
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

    public AvatarUrls withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("_48x48", _48x48).append("_24x24", _24x24).append("_16x16", _16x16).append("_32x32", _32x32).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(_24x24).append(_32x32).append(_16x16).append(_48x48).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AvatarUrls) == false) {
            return false;
        }
        AvatarUrls rhs = ((AvatarUrls) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(_24x24, rhs._24x24).append(_32x32, rhs._32x32).append(_16x16, rhs._16x16).append(_48x48, rhs._48x48).isEquals();
    }

}
