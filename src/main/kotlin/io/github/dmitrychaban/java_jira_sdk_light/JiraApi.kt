package io.github.dmitrychaban.java_jira_sdk_light

import io.github.dmitrychaban.java_jira_sdk_light.model.JiraProject
import reactor.core.publisher.Mono

interface JiraApi {
    fun getJiraProjects(): Mono<List<JiraProject>>

//    fun getTasksByProject(project: JiraProject):
}
