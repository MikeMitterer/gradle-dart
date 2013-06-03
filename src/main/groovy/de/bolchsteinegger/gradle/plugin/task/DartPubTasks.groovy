package de.bolchsteinegger.gradle.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.slf4j.Logger

class DartPubInstallTask extends AbstractPubTask {

    @TaskAction
    def run() {
        project.logger.lifecycle("Installing dependencies defined in ${project.dart.pubspecDirectory}/pubspec.yaml")
        executePubCommand("install")
    }

}
class DartPubPublishTask extends AbstractPubTask {

    @TaskAction
    def run() {
        project.logger.lifecycle("Publishing project")
        executePubCommand("publish")
    }

}
class DartPubUpdateTask extends AbstractPubTask {

    @TaskAction
    def run() {
        project.logger.lifecycle("Updating dependencies defined in ${project.dart.pubspecDirectory}/pubspec.yaml")
        executePubCommand("update")
    }

}