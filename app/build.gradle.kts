plugins {
    id("my.company.java-application")
}

application {
    mainClass.set("my.company.MyApp")
}

dependencies {
    implementation(project(":business-logic"))
    implementation(project(":data-model"))
}
