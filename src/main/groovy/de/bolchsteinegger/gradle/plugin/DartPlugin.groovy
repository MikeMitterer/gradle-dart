package de.bolchsteinegger.gradle.plugin

import de.bolchsteinegger.gradle.plugin.task.AnalyseDartTask
import de.bolchsteinegger.gradle.plugin.task.DartPubInstallTask
import de.bolchsteinegger.gradle.plugin.task.DartPubPublishTask
import de.bolchsteinegger.gradle.plugin.task.DartPubUpdateTask
import de.bolchsteinegger.gradle.plugin.task.ExecuteWithDartVmTask
import de.bolchsteinegger.gradle.plugin.task.TestDartTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class DartPlugin implements Plugin<Project> {

	@Override
	void apply(Project project) {
        project.extensions.create('dart', DartPluginExtension)
        project.dart.initDefaultValues(project)

        project.task('pubInstall', type: DartPubInstallTask, group: 'Build', description: 'installs all dart dependencies listed in the projects pubspec.yaml file. Directory of pubspec.yaml can be defined by property \'pubspecDirectory\'.')
        project.task('pubUpdate', type: DartPubUpdateTask, group: 'Build', description: 'updates all dart dependencies listed in the projects pubspec.yaml file. Directory of pubspec.yaml can be defined by property \'pubspecDirectory\'.')
        project.task('pubPublish', type: DartPubPublishTask, group: 'Other', description: 'project is published via pub.')
        project.task('testDart', type: TestDartTask, group: 'Other', description: 'executes the tests in the \'testDirectory\'.')
        project.task('analyseDart', type: AnalyseDartTask, group: 'Other', description: 'analyses the files in the \'sourceDirectory\'.')
        project.task('executeWithDartVm', type: ExecuteWithDartVmTask, group: 'Other', description: 'executes the files defined by property \'executableDartFiles\' (Set) on the local dart vm.')
	}
}
