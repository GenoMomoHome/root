rootProject.name = "GenoMomoHome"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":db")
include(":gateway")
include(":tools:clothes-chooser")
