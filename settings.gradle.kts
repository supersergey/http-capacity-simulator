apply(from = "./resolutions.gradle.kts")

rootProject.name = "http-capacity-simulator"

include(":delay")
include(":nonblocking")
include(":blocking")
