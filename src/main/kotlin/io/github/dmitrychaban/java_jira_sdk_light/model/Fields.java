
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
    "fixVersions",
    "aggregatetimespent",
    "resolution",
    "security",
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
    "priority",
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
    @JsonProperty("fixVersions")
    @Valid
    private List<FixVersion> fixVersions = null;
    @JsonProperty("aggregatetimespent")
    private Object aggregatetimespent;
    @JsonProperty("resolution")
    private Object resolution;
    @JsonProperty("security")
    private Object security;
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
    @JsonProperty("priority")
    @Valid
    private Priority priority;
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
        return new ToStringBuilder(this)
                .append("issuetype", issuetype)
                .append("components", components)
                .append("timespent", timespent)
                .append("timeoriginalestimate", timeoriginalestimate)
                .append("project", project)
                .append("description", description)
                .append("fixVersions", fixVersions)
                .append("aggregatetimespent", aggregatetimespent)
                .append("resolution", resolution)
                .append("security", security)
                .append("aggregatetimeestimate", aggregatetimeestimate)
                .append("resolutiondate", resolutiondate)
                .append("workratio", workratio)
                .append("summary", summary)
                .append("lastViewed", lastViewed)
                .append("watches", watches)
                .append("creator", creator)
                .append("subtasks", subtasks)
                .append("created", created)
                .append("reporter", reporter)
                .append("aggregateprogress", aggregateprogress)
                .append("priority", priority)
                .append("labels", labels)
                .append("environment", environment)
                .append("timeestimate", timeestimate)
                .append("aggregatetimeoriginalestimate", aggregatetimeoriginalestimate)
                .append("versions", versions)
                .append("duedate", duedate)
                .append("progress", progress)
                .append("issuelinks", issuelinks)
                .append("votes", votes)
                .append("assignee", assignee)
                .append("updated", updated)
                .append("status", status)
                .append("additionalProperties", additionalProperties)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Fields fields = (Fields) o;

        return new EqualsBuilder()
                .append(issuetype, fields.issuetype)
                .append(components, fields.components)
                .append(timespent, fields.timespent)
                .append(timeoriginalestimate, fields.timeoriginalestimate)
                .append(project, fields.project)
                .append(description, fields.description)
                .append(fixVersions, fields.fixVersions)
                .append(aggregatetimespent, fields.aggregatetimespent)
                .append(resolution, fields.resolution)
                .append(security, fields.security)
                .append(aggregatetimeestimate, fields.aggregatetimeestimate)
                .append(resolutiondate, fields.resolutiondate)
                .append(workratio, fields.workratio)
                .append(summary, fields.summary)
                .append(lastViewed, fields.lastViewed)
                .append(watches, fields.watches)
                .append(creator, fields.creator)
                .append(subtasks, fields.subtasks)
                .append(created, fields.created)
                .append(reporter, fields.reporter)
                .append(aggregateprogress, fields.aggregateprogress)
                .append(priority, fields.priority)
                .append(labels, fields.labels)
                .append(environment, fields.environment)
                .append(timeestimate, fields.timeestimate)
                .append(aggregatetimeoriginalestimate, fields.aggregatetimeoriginalestimate)
                .append(versions, fields.versions)
                .append(duedate, fields.duedate)
                .append(progress, fields.progress)
                .append(issuelinks, fields.issuelinks)
                .append(votes, fields.votes)
                .append(assignee, fields.assignee)
                .append(updated, fields.updated)
                .append(status, fields.status)
                .append(additionalProperties, fields.additionalProperties)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(issuetype)
                .append(components)
                .append(timespent)
                .append(timeoriginalestimate)
                .append(project)
                .append(description)
                .append(fixVersions)
                .append(aggregatetimespent)
                .append(resolution)
                .append(security)
                .append(aggregatetimeestimate)
                .append(resolutiondate)
                .append(workratio)
                .append(summary)
                .append(lastViewed)
                .append(watches)
                .append(creator)
                .append(subtasks)
                .append(created)
                .append(reporter)
                .append(aggregateprogress)
                .append(priority)
                .append(labels)
                .append(environment)
                .append(timeestimate)
                .append(aggregatetimeoriginalestimate)
                .append(versions)
                .append(duedate)
                .append(progress)
                .append(issuelinks)
                .append(votes)
                .append(assignee)
                .append(updated)
                .append(status)
                .append(additionalProperties)
                .toHashCode();
    }
}
