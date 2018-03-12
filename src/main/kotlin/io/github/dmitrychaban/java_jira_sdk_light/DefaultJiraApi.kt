package io.github.dmitrychaban.java_jira_sdk_light

import io.github.dmitrychaban.java_jira_sdk_light.model.JiraProject
import reactor.core.publisher.Mono

class DefaultJiraApi : JiraApi {

    override fun getJiraProjects(): Mono<List<JiraProject>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
