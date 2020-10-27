apply(from = "./resolutions.gradle.kts")

rootProject.name = "http-capacity-simulator"

include(":launcher")
include(":blocking")
include(":nonblocking")
include(":ktor")