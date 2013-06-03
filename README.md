#Gradle Dart Plugin
==================

Provides gradle integration for Dart projects

Example usage

apply plugin: de.bolchsteinegger.gradle.plugin.DartPlugin
dart {
    dartSdkHome: '/usr/share/dart-sdk'
    relativeSourceDirectory: 'lib/src'
}
defaultTask 'pubInstall', 'testDart'
buildscript {
        repositories {
                maven { url "http://travep.de/maven/" }
        }
        dependencies {
                classpath 'de.bolchsteinegger:gradle-dart-plugin:0.1.0'
        }
}


Available gradle tasks
 - pubInstall (resolves dependencies with pub install)
 - pubUpdate (updates dependencies with pub update)
 - pubPublish (publishes the project with pub publish)
 - analyseDart (alayses files in source folder)
 - testDart (executes tests in test folder)


Available settings
 - dartSdkHome / dartSdkBin
  - Default: empty string or 'DART_SDK' environment variable
  - Used for execution of dart commands. Set 'dartSdkHome' or 'dartSdkBin' if you don't have the dart sdk bin in your path variables.

 - commandLineParameters
  - Default: empty set
  - Additional parameters for command execution.

 - pubspecDirectory
  - Default: Project directory (Location of build.gradle)
  - Directory of 'pubspec.yaml' file.
 
 - sourceDirectory / relativeSourceDirectory
  - Default: $ProjectDirectory$/lib/src (according to preferred project structure)
  - Needed for analysing source files. The path can be set relative to the project directory.

 - analysePackagesFolders
  - Default: false
  - Define whether packages folder shall be analysed.

 - testDirectory / relativeTestDirectory
  - Default: $ProjectDirectory$/test (according to preferred project structure)
  - Needed for executing tests. The path can be set relative to the project directory.

 - testPackagesFolders
  - Default: false
  - Define whether packages folder shall be tested.
