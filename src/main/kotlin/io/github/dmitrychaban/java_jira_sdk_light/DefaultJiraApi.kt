package io.github.dmitrychaban.java_jira_sdk_light

import io.github.dmitrychaban.java_jira_sdk_light.model.JiraProject
import io.github.dmitrychaban.java_jira_sdk_light.model.QueryResponse
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToMono
import reactor.core.publisher.Mono
import java.util.*

class DefaultJiraApi(val token: String, val mail: String) : JiraApi {

    val client: WebClient = WebClient.create("https://scenario.atlassian.net/rest/api/2")
    val headerTokenValue = "$mail:$token"
    val encodedHeaderTokenValue = String(Base64.getEncoder().encode(headerTokenValue.toByteArray()))

    override fun getJiraProjects(): Mono<List<JiraProject>> {
        return client.get().uri("/project")
                .accept(MediaType.APPLICATION_JSON)
                .header("Authorization", "Basic $encodedHeaderTokenValue")
                .retrieve()
                .bodyToMono()
    }

    override fun getTasksByProject(project: JiraProject, startFrom: Long, maxResult: Long): Mono<QueryResponse> {
        return client.get().uri("/search?jql=project={projectId}", project.id)
                .accept(MediaType.APPLICATION_JSON)
                .header("Authorization", "Basic $encodedHeaderTokenValue")
                .retrieve()
                .bodyToMono()
    }
}

