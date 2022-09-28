plugins {
    id("my.company.java-library")
}

// configurations.implementation // Scope
// configurations.runtimeOnly
// configurations.compileOnly
// configurations.api

// // Dependency Resolution Result
// configurations.runtimeClasspath
// configurations.compileClasspath

dependencies {
    api(project(":data-model"))
    api("com.google.guava:guava:31.1-jre")

    // implementation("org.apache.commons:commons-lang3:3.12.0")
    // implementation("org.slf4j:slf4j-api:1.7.36")
    implementation(libs.commons.lang)
    implementation(libs.slf4j.api)
}
