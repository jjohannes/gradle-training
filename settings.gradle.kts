
pluginManagement {
    repositories.gradlePluginPortal()
    // repositories.mavenCentral()
    // repositories.maven("https://my.location/repo")

    includeBuild("gradle/plugins")
}


dependencyResolutionManagement {
    repositories.mavenCentral()
    // repositories.maven("https://my.location/repo")

    // includeBuild("../other-project")
    includeBuild("gradle/platform")
}

rootProject.name = "gradle-training"

include("app")
include("business-logic")
include("data-model")