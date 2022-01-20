pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        // maven("https://myrepo")
    }
    includeBuild("gradle-build-logic")
}

//plugins {
//    // if plugin was published, we could set a version here:
//    id("org.example.product.java-library").version("1.0")
//}

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



