
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
    "issuetype",
    "components",
    "timespent",
    "timeoriginalestimate",
    "project",
    "description",
    "customfield_10010",
    "fixVersions",
    "customfield_10011",
    "customfield_10012",
    "aggregatetimespent",
    "resolution",
    "customfield_10013",
    "customfield_10014",
    "security",
    "customfield_10008",
    "customfield_10009",
    "aggregatetimeestimate",
    "resolutiondate",
    "workratio",
    "summary",
    "lastViewed",
    "watches",
    "creator",
    "subtasks",
    "created",
    "reporter",
    "aggregateprogress",
    "customfield_10000",
    "priority",
    "customfield_10001",
    "customfield_10002",
    "customfield_10003",
    "customfield_10004",
    "labels",
    "environment",
    "timeestimate",
    "aggregatetimeoriginalestimate",
    "versions",
    "duedate",
    "progress",
    "issuelinks",
    "votes",
    "assignee",
    "updated",
    "status"
})
public class Fields implements Serializable
{

    @JsonProperty("issuetype")
    @Valid
    private Issuetype issuetype;
    @JsonProperty("components")
    @Valid
    private List<Object> components = null;
    @JsonProperty("timespent")
    private Object timespent;
    @JsonProperty("timeoriginalestimate")
    private Object timeoriginalestimate;
    @JsonProperty("project")
    @Valid
    private Project project;
    @JsonProperty("description")
    private String description;
    @JsonProperty("customfield_10010")
    @Valid
    private List<String> customfield10010 = null;
    @JsonProperty("fixVersions")
    @Valid
    private List<FixVersion> fixVersions = null;
    @JsonProperty("customfield_10011")
    private String customfield10011;
    @JsonProperty("customfield_10012")
    private Object customfield10012;
    @JsonProperty("aggregatetimespent")
    private Object aggregatetimespent;
    @JsonProperty("resolution")
    private Object resolution;
    @JsonProperty("customfield_10013")
    private Object customfield10013;
    @JsonProperty("customfield_10014")
    private Integer customfield10014;
    @JsonProperty("security")
    private Object security;
    @JsonProperty("customfield_10008")
    private Object customfield10008;
    @JsonProperty("customfield_10009")
    private Object customfield10009;
    @JsonProperty("aggregatetimeestimate")
    private Object aggregatetimeestimate;
    @JsonProperty("resolutiondate")
    private Object resolutiondate;
    @JsonProperty("workratio")
    private Integer workratio;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("lastViewed")
    private Object lastViewed;
    @JsonProperty("watches")
    @Valid
    private Watches watches;
    @JsonProperty("creator")
    @Valid
    private Creator creator;
    @JsonProperty("subtasks")
    @Valid
    private List<Object> subtasks = null;
    @JsonProperty("created")
    private String created;
    @JsonProperty("reporter")
    @Valid
    private Reporter reporter;
    @JsonProperty("aggregateprogress")
    @Valid
    private Aggregateprogress aggregateprogress;
    @JsonProperty("customfield_10000")
    private String customfield10000;
    @JsonProperty("priority")
    @Valid
    private Priority priority;
    @JsonProperty("customfield_10001")
    private Object customfield10001;
    @JsonProperty("customfield_10002")
    private Object customfield10002;
    @JsonProperty("customfield_10003")
    private Object customfield10003;
    @JsonProperty("customfield_10004")
    private Object customfield10004;
    @JsonProperty("labels")
    @Valid
    private List<Object> labels = null;
    @JsonProperty("environment")
    private Object environment;
    @JsonProperty("timeestimate")
    private Object timeestimate;
    @JsonProperty("aggregatetimeoriginalestimate")
    private Object aggregatetimeoriginalestimate;
    @JsonProperty("versions")
    @Valid
    private List<Object> versions = null;
    @JsonProperty("duedate")
    private Object duedate;
    @JsonProperty("progress")
    @Valid
    private Progress progress;
    @JsonProperty("issuelinks")
    @Valid
    private List<Object> issuelinks = null;
    @JsonProperty("votes")
    @Valid
    private Votes votes;
    @JsonProperty("assignee")
    private Object assignee;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("status")
    @Valid
    private Status status;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4985889707215183720L;

    @JsonProperty("issuetype")
    public Issuetype getIssuetype() {
        return issuetype;
    }

    @JsonProperty("issuetype")
    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

    public Fields withIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
        return this;
    }

    @JsonProperty("components")
    public List<Object> getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(List<Object> components) {
        this.components = components;
    }

    public Fields withComponents(List<Object> components) {
        this.components = components;
        return this;
    }

    @JsonProperty("timespent")
    public Object getTimespent() {
        return timespent;
    }

    @JsonProperty("timespent")
    public void setTimespent(Object timespent) {
        this.timespent = timespent;
    }

    public Fields withTimespent(Object timespent) {
        this.timespent = timespent;
        return this;
    }

    @JsonProperty("timeoriginalestimate")
    public Object getTimeoriginalestimate() {
        return timeoriginalestimate;
    }

    @JsonProperty("timeoriginalestimate")
    public void setTimeoriginalestimate(Object timeoriginalestimate) {
        this.timeoriginalestimate = timeoriginalestimate;
    }

    public Fields withTimeoriginalestimate(Object timeoriginalestimate) {
        this.timeoriginalestimate = timeoriginalestimate;
        return this;
    }

    @JsonProperty("project")
    public Project getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(Project project) {
        this.project = project;
    }

    public Fields withProject(Project project) {
        this.project = project;
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

    public Fields withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("customfield_10010")
    public List<String> getCustomfield10010() {
        return customfield10010;
    }

    @JsonProperty("customfield_10010")
    public void setCustomfield10010(List<String> customfield10010) {
        this.customfield10010 = customfield10010;
    }

    public Fields withCustomfield10010(List<String> customfield10010) {
        this.customfield10010 = customfield10010;
        return this;
    }

    @JsonProperty("fixVersions")
    public List<FixVersion> getFixVersions() {
        return fixVersions;
    }

    @JsonProperty("fixVersions")
    public void setFixVersions(List<FixVersion> fixVersions) {
        this.fixVersions = fixVersions;
    }

    public Fields withFixVersions(List<FixVersion> fixVersions) {
        this.fixVersions = fixVersions;
        return this;
    }

    @JsonProperty("customfield_10011")
    public String getCustomfield10011() {
        return customfield10011;
    }

    @JsonProperty("customfield_10011")
    public void setCustomfield10011(String customfield10011) {
        this.customfield10011 = customfield10011;
    }

    public Fields withCustomfield10011(String customfield10011) {
        this.customfield10011 = customfield10011;
        return this;
    }

    @JsonProperty("customfield_10012")
    public Object getCustomfield10012() {
        return customfield10012;
    }

    @JsonProperty("customfield_10012")
    public void setCustomfield10012(Object customfield10012) {
        this.customfield10012 = customfield10012;
    }

    public Fields withCustomfield10012(Object customfield10012) {
        this.customfield10012 = customfield10012;
        return this;
    }

    @JsonProperty("aggregatetimespent")
    public Object getAggregatetimespent() {
        return aggregatetimespent;
    }

    @JsonProperty("aggregatetimespent")
    public void setAggregatetimespent(Object aggregatetimespent) {
        this.aggregatetimespent = aggregatetimespent;
    }

    public Fields withAggregatetimespent(Object aggregatetimespent) {
        this.aggregatetimespent = aggregatetimespent;
        return this;
    }

    @JsonProperty("resolution")
    public Object getResolution() {
        return resolution;
    }

    @JsonProperty("resolution")
    public void setResolution(Object resolution) {
        this.resolution = resolution;
    }

    public Fields withResolution(Object resolution) {
        this.resolution = resolution;
        return this;
    }

    @JsonProperty("customfield_10013")
    public Object getCustomfield10013() {
        return customfield10013;
    }

    @JsonProperty("customfield_10013")
    public void setCustomfield10013(Object customfield10013) {
        this.customfield10013 = customfield10013;
    }

    public Fields withCustomfield10013(Object customfield10013) {
        this.customfield10013 = customfield10013;
        return this;
    }

    @JsonProperty("customfield_10014")
    public Integer getCustomfield10014() {
        return customfield10014;
    }

    @JsonProperty("customfield_10014")
    public void setCustomfield10014(Integer customfield10014) {
        this.customfield10014 = customfield10014;
    }

    public Fields withCustomfield10014(Integer customfield10014) {
        this.customfield10014 = customfield10014;
        return this;
    }

    @JsonProperty("security")
    public Object getSecurity() {
        return security;
    }

    @JsonProperty("security")
    public void setSecurity(Object security) {
        this.security = security;
    }

    public Fields withSecurity(Object security) {
        this.security = security;
        return this;
    }

    @JsonProperty("customfield_10008")
    public Object getCustomfield10008() {
        return customfield10008;
    }

    @JsonProperty("customfield_10008")
    public void setCustomfield10008(Object customfield10008) {
        this.customfield10008 = customfield10008;
    }

    public Fields withCustomfield10008(Object customfield10008) {
        this.customfield10008 = customfield10008;
        return this;
    }

    @JsonProperty("customfield_10009")
    public Object getCustomfield10009() {
        return customfield10009;
    }

    @JsonProperty("customfield_10009")
    public void setCustomfield10009(Object customfield10009) {
        this.customfield10009 = customfield10009;
    }

    public Fields withCustomfield10009(Object customfield10009) {
        this.customfield10009 = customfield10009;
        return this;
    }

    @JsonProperty("aggregatetimeestimate")
    public Object getAggregatetimeestimate() {
        return aggregatetimeestimate;
    }

    @JsonProperty("aggregatetimeestimate")
    public void setAggregatetimeestimate(Object aggregatetimeestimate) {
        this.aggregatetimeestimate = aggregatetimeestimate;
    }

    public Fields withAggregatetimeestimate(Object aggregatetimeestimate) {
        this.aggregatetimeestimate = aggregatetimeestimate;
        return this;
    }

    @JsonProperty("resolutiondate")
    public Object getResolutiondate() {
        return resolutiondate;
    }

    @JsonProperty("resolutiondate")
    public void setResolutiondate(Object resolutiondate) {
        this.resolutiondate = resolutiondate;
    }

    public Fields withResolutiondate(Object resolutiondate) {
        this.resolutiondate = resolutiondate;
        return this;
    }

    @JsonProperty("workratio")
    public Integer getWorkratio() {
        return workratio;
    }

    @JsonProperty("workratio")
    public void setWorkratio(Integer workratio) {
        this.workratio = workratio;
    }

    public Fields withWorkratio(Integer workratio) {
        this.workratio = workratio;
        return this;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Fields withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @JsonProperty("lastViewed")
    public Object getLastViewed() {
        return lastViewed;
    }

    @JsonProperty("lastViewed")
    public void setLastViewed(Object lastViewed) {
        this.lastViewed = lastViewed;
    }

    public Fields withLastViewed(Object lastViewed) {
        this.lastViewed = lastViewed;
        return this;
    }

    @JsonProperty("watches")
    public Watches getWatches() {
        return watches;
    }

    @JsonProperty("watches")
    public void setWatches(Watches watches) {
        this.watches = watches;
    }

    public Fields withWatches(Watches watches) {
        this.watches = watches;
        return this;
    }

    @JsonProperty("creator")
    public Creator getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public Fields withCreator(Creator creator) {
        this.creator = creator;
        return this;
    }

    @JsonProperty("subtasks")
    public List<Object> getSubtasks() {
        return subtasks;
    }

    @JsonProperty("subtasks")
    public void setSubtasks(List<Object> subtasks) {
        this.subtasks = subtasks;
    }

    public Fields withSubtasks(List<Object> subtasks) {
        this.subtasks = subtasks;
        return this;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    public Fields withCreated(String created) {
        this.created = created;
        return this;
    }

    @JsonProperty("reporter")
    public Reporter getReporter() {
        return reporter;
    }

    @JsonProperty("reporter")
    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    public Fields withReporter(Reporter reporter) {
        this.reporter = reporter;
        return this;
    }

    @JsonProperty("aggregateprogress")
    public Aggregateprogress getAggregateprogress() {
        return aggregateprogress;
    }

    @JsonProperty("aggregateprogress")
    public void setAggregateprogress(Aggregateprogress aggregateprogress) {
        this.aggregateprogress = aggregateprogress;
    }

    public Fields withAggregateprogress(Aggregateprogress aggregateprogress) {
        this.aggregateprogress = aggregateprogress;
        return this;
    }

    @JsonProperty("customfield_10000")
    public String getCustomfield10000() {
        return customfield10000;
    }

    @JsonProperty("customfield_10000")
    public void setCustomfield10000(String customfield10000) {
        this.customfield10000 = customfield10000;
    }

    public Fields withCustomfield10000(String customfield10000) {
        this.customfield10000 = customfield10000;
        return this;
    }

    @JsonProperty("priority")
    public Priority getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Fields withPriority(Priority priority) {
        this.priority = priority;
        return this;
    }

    @JsonProperty("customfield_10001")
    public Object getCustomfield10001() {
        return customfield10001;
    }

    @JsonProperty("customfield_10001")
    public void setCustomfield10001(Object customfield10001) {
        this.customfield10001 = customfield10001;
    }

    public Fields withCustomfield10001(Object customfield10001) {
        this.customfield10001 = customfield10001;
        return this;
    }

    @JsonProperty("customfield_10002")
    public Object getCustomfield10002() {
        return customfield10002;
    }

    @JsonProperty("customfield_10002")
    public void setCustomfield10002(Object customfield10002) {
        this.customfield10002 = customfield10002;
    }

    public Fields withCustomfield10002(Object customfield10002) {
        this.customfield10002 = customfield10002;
        return this;
    }

    @JsonProperty("customfield_10003")
    public Object getCustomfield10003() {
        return customfield10003;
    }

    @JsonProperty("customfield_10003")
    public void setCustomfield10003(Object customfield10003) {
        this.customfield10003 = customfield10003;
    }

    public Fields withCustomfield10003(Object customfield10003) {
        this.customfield10003 = customfield10003;
        return this;
    }

    @JsonProperty("customfield_10004")
    public Object getCustomfield10004() {
        return customfield10004;
    }

    @JsonProperty("customfield_10004")
    public void setCustomfield10004(Object customfield10004) {
        this.customfield10004 = customfield10004;
    }

    public Fields withCustomfield10004(Object customfield10004) {
        this.customfield10004 = customfield10004;
        return this;
    }

    @JsonProperty("labels")
    public List<Object> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    public Fields withLabels(List<Object> labels) {
        this.labels = labels;
        return this;
    }

    @JsonProperty("environment")
    public Object getEnvironment() {
        return environment;
    }

    @JsonProperty("environment")
    public void setEnvironment(Object environment) {
        this.environment = environment;
    }

    public Fields withEnvironment(Object environment) {
        this.environment = environment;
        return this;
    }

    @JsonProperty("timeestimate")
    public Object getTimeestimate() {
        return timeestimate;
    }

    @JsonProperty("timeestimate")
    public void setTimeestimate(Object timeestimate) {
        this.timeestimate = timeestimate;
    }

    public Fields withTimeestimate(Object timeestimate) {
        this.timeestimate = timeestimate;
        return this;
    }

    @JsonProperty("aggregatetimeoriginalestimate")
    public Object getAggregatetimeoriginalestimate() {
        return aggregatetimeoriginalestimate;
    }

    @JsonProperty("aggregatetimeoriginalestimate")
    public void setAggregatetimeoriginalestimate(Object aggregatetimeoriginalestimate) {
        this.aggregatetimeoriginalestimate = aggregatetimeoriginalestimate;
    }

    public Fields withAggregatetimeoriginalestimate(Object aggregatetimeoriginalestimate) {
        this.aggregatetimeoriginalestimate = aggregatetimeoriginalestimate;
        return this;
    }

    @JsonProperty("versions")
    public List<Object> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(List<Object> versions) {
        this.versions = versions;
    }

    public Fields withVersions(List<Object> versions) {
        this.versions = versions;
        return this;
    }

    @JsonProperty("duedate")
    public Object getDuedate() {
        return duedate;
    }

    @JsonProperty("duedate")
    public void setDuedate(Object duedate) {
        this.duedate = duedate;
    }

    public Fields withDuedate(Object duedate) {
        this.duedate = duedate;
        return this;
    }

    @JsonProperty("progress")
    public Progress getProgress() {
        return progress;
    }

    @JsonProperty("progress")
    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public Fields withProgress(Progress progress) {
        this.progress = progress;
        return this;
    }

    @JsonProperty("issuelinks")
    public List<Object> getIssuelinks() {
        return issuelinks;
    }

    @JsonProperty("issuelinks")
    public void setIssuelinks(List<Object> issuelinks) {
        this.issuelinks = issuelinks;
    }

    public Fields withIssuelinks(List<Object> issuelinks) {
        this.issuelinks = issuelinks;
        return this;
    }

    @JsonProperty("votes")
    public Votes getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    public Fields withVotes(Votes votes) {
        this.votes = votes;
        return this;
    }

    @JsonProperty("assignee")
    public Object getAssignee() {
        return assignee;
    }

    @JsonProperty("assignee")
    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    public Fields withAssignee(Object assignee) {
        this.assignee = assignee;
        return this;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Fields withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    public Fields withStatus(Status status) {
        this.status = status;
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

    public Fields withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("issuetype", issuetype).append("components", components).append("timespent", timespent).append("timeoriginalestimate", timeoriginalestimate).append("project", project).append("description", description).append("customfield10010", customfield10010).append("fixVersions", fixVersions).append("customfield10011", customfield10011).append("customfield10012", customfield10012).append("aggregatetimespent", aggregatetimespent).append("resolution", resolution).append("customfield10013", customfield10013).append("customfield10014", customfield10014).append("security", security).append("customfield10008", customfield10008).append("customfield10009", customfield10009).append("aggregatetimeestimate", aggregatetimeestimate).append("resolutiondate", resolutiondate).append("workratio", workratio).append("summary", summary).append("lastViewed", lastViewed).append("watches", watches).append("creator", creator).append("subtasks", subtasks).append("created", created).append("reporter", reporter).append("aggregateprogress", aggregateprogress).append("customfield10000", customfield10000).append("priority", priority).append("customfield10001", customfield10001).append("customfield10002", customfield10002).append("customfield10003", customfield10003).append("customfield10004", customfield10004).append("labels", labels).append("environment", environment).append("timeestimate", timeestimate).append("aggregatetimeoriginalestimate", aggregatetimeoriginalestimate).append("versions", versions).append("duedate", duedate).append("progress", progress).append("issuelinks", issuelinks).append("votes", votes).append("assignee", assignee).append("updated", updated).append("status", status).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(progress).append(summary).append(customfield10012).append(issuetype).append(customfield10011).append(customfield10014).append(customfield10013).append(votes).append(customfield10010).append(security).append(resolution).append(fixVersions).append(resolutiondate).append(timespent).append(creator).append(reporter).append(aggregatetimeoriginalestimate).append(updated).append(created).append(priority).append(description).append(duedate).append(issuelinks).append(watches).append(customfield10003).append(customfield10002).append(customfield10001).append(customfield10000).append(subtasks).append(status).append(labels).append(customfield10004).append(assignee).append(workratio).append(aggregatetimeestimate).append(versions).append(project).append(environment).append(additionalProperties).append(timeestimate).append(aggregateprogress).append(lastViewed).append(customfield10008).append(customfield10009).append(components).append(timeoriginalestimate).append(aggregatetimespent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fields) == false) {
            return false;
        }
        Fields rhs = ((Fields) other);
        return new EqualsBuilder().append(progress, rhs.progress).append(summary, rhs.summary).append(customfield10012, rhs.customfield10012).append(issuetype, rhs.issuetype).append(customfield10011, rhs.customfield10011).append(customfield10014, rhs.customfield10014).append(customfield10013, rhs.customfield10013).append(votes, rhs.votes).append(customfield10010, rhs.customfield10010).append(security, rhs.security).append(resolution, rhs.resolution).append(fixVersions, rhs.fixVersions).append(resolutiondate, rhs.resolutiondate).append(timespent, rhs.timespent).append(creator, rhs.creator).append(reporter, rhs.reporter).append(aggregatetimeoriginalestimate, rhs.aggregatetimeoriginalestimate).append(updated, rhs.updated).append(created, rhs.created).append(priority, rhs.priority).append(description, rhs.description).append(duedate, rhs.duedate).append(issuelinks, rhs.issuelinks).append(watches, rhs.watches).append(customfield10003, rhs.customfield10003).append(customfield10002, rhs.customfield10002).append(customfield10001, rhs.customfield10001).append(customfield10000, rhs.customfield10000).append(subtasks, rhs.subtasks).append(status, rhs.status).append(labels, rhs.labels).append(customfield10004, rhs.customfield10004).append(assignee, rhs.assignee).append(workratio, rhs.workratio).append(aggregatetimeestimate, rhs.aggregatetimeestimate).append(versions, rhs.versions).append(project, rhs.project).append(environment, rhs.environment).append(additionalProperties, rhs.additionalProperties).append(timeestimate, rhs.timeestimate).append(aggregateprogress, rhs.aggregateprogress).append(lastViewed, rhs.lastViewed).append(customfield10008, rhs.customfield10008).append(customfield10009, rhs.customfield10009).append(components, rhs.components).append(timeoriginalestimate, rhs.timeoriginalestimate).append(aggregatetimespent, rhs.aggregatetimespent).isEquals();
    }

}
