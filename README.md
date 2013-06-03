#Gradle Dart Plugin

Provides gradle integration for Dart projects.
> Contribution is highly welcome! Feel free to ask for contribution or fork the project as often as you want.

##Example usage

```groovy
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
```


##Available gradle tasks
 - __pubInstall__ (resolves dependencies with pub install)
 - __pubUpdate__ (updates dependencies with pub update)
 - __pubPublish__ (publishes the project with pub publish)
 - __analyseDart__ (alayses files in source folder)
 - __testDart__ (executes tests in test folder)


##Available settings
 - __dartSdkHome / dartSdkBin__
  - Default: empty string or 'DART_SDK' environment variable
  - Used for execution of dart commands. Set 'dartSdkHome' or 'dartSdkBin' if you don't have the dart sdk bin in your path variables.

 - __commandLineParameters__
  - Default: empty set
  - Additional parameters for command execution.

 - __pubspecDirectory__
  - Default: Project directory (Location of build.gradle)
  - Directory of 'pubspec.yaml' file.
 
 - __sourceDirectory / relativeSourceDirectory__
  - Default: $ProjectDirectory$/lib/src (according to preferred project structure)
  - Needed for analysing source files. The path can be set relative to the project directory.

 - __analysePackagesFolders__
  - Default: false
  - Define whether packages folder shall be analysed.

 - __testDirectory / relativeTestDirectory__
  - Default: $ProjectDirectory$/test (according to preferred project structure)
  - Needed for executing tests. The path can be set relative to the project directory.

 - __testPackagesFolders__
  - Default: false
  - Define whether packages folder shall be tested.
