plugins {
    id("my.company.java-application")
}

application {
    mainClass.set("my.company.MyApp")
}

dependencies {
    implementation(project(":business-logic"))
    implementation(project(":data-model"))

    implementation("com.google.code.findbugs:jsr305:3.0.1")

    runtimeOnly(libs.slf4j.simple)
    implementation(libs.commons.lang)

}
