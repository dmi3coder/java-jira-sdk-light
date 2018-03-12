package io.github.dmitrychaban.java_jira_sdk_light

import io.github.dmitrychaban.java_jira_sdk_light.model.JiraProject
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

class DefaultJiraApi(val token: String, val mail: String) : JiraApi {

    val client: WebClient = WebClient.create("https://scenario.atlassian.net/rest/api/2")

    override fun getJiraProjects(): Mono<List<JiraProject>> {
        val headerTokenValue = "$mail:$token"
        val encodedHeaderTokenValue = String(Base64.getEncoder().encode(headerTokenValue.toByteArray()))
        val type = object : ParameterizedTypeReference<List<JiraProject>>() {}
        return client.get().uri("/project")
                .accept(MediaType.APPLICATION_JSON)
                .header("Authorization", "Basic $encodedHeaderTokenValue")
                .retrieve()
                .bodyToMono(type)
    }
}


fun main(args: Array<String>) {
    var jiraProjects = DefaultJiraApi("", "").getJiraProjects()
    println(jiraProjects.flatMapMany { Flux.fromIterable(it) }.map { it.name }.collectList().block())
}
