pluginManagement {
    repositories.gradlePluginPortal()
    // repositories.maven("https://mycompany.com/plugins-repo")

    includeBuild("gradle/plugins")
}


dependencyResolutionManagement {
    repositories.mavenCentral()
    // repositories.maven("https://mycompany.com/repo") {
    //     credentials {
    //
    //     }
    // }

    // includeBuild("../my-other-project")
}

include("app")
include("business-logic")
include("data-model")
