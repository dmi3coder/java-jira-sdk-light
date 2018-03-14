package io.github.dmitrychaban.java_jira_sdk_light

import io.github.dmitrychaban.java_jira_sdk_light.model.Issue
import io.github.dmitrychaban.java_jira_sdk_light.model.JiraProject
import io.github.dmitrychaban.java_jira_sdk_light.model.QueryResponse
import reactor.core.publisher.Mono

interface JiraApi {
    fun getJiraProjects(): Mono<List<JiraProject>>

    fun getTasksByProject(project: JiraProject, startFrom: Long, maxResult: Long): Mono<QueryResponse>
}
