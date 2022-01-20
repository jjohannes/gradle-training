pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    // includeBuild("../other-project-with-build-logic")
}
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }
    // includeBuild("../other-project")
}

include("app")
include("business-logic")
include("data-model")



