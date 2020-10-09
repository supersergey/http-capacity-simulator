val springVersion = "2.3.4.RELEASE"
val coroutinesVersion = "1.3.8"

gradle.settingsEvaluated {

    pluginManagement {
        resolutionStrategy {
            eachPlugin {
                when (requested.id.namespace) {
                    "org.springframework.boot" -> useVersion(springVersion)
                }
            }
        }
    }
}

gradle.allprojects {
    configurations.all {
        resolutionStrategy {
            eachDependency {
                when (requested.group) {
                    "org.springframework.boot" -> useVersion(springVersion)
                    "org.jetbrains.kotlinx" -> useVersion(coroutinesVersion)
                }
            }
        }
    }
}