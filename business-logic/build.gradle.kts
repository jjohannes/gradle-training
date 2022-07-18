plugins {
    id("com.bosch.java-library")
}
/*
configurations {
    runtimeOnly
    implementation
    api
    runtimeClasspath.extendsFrom(runtimeOnly, implementation, api)
    compileClasspath.extendsFrom(implementation, api)
}
*/

dependencies {
    implementation(platform("com.example:platform"))

    api(project(":data-model")) // == api("com.example.app:data-model")

    implementation("org.apache.commons:commons-lang3") // <-- Platform
    // implementation(libs.commons.lang) // <-- Version Catalog

    // implementation("org.slf4j:slf4j-api")
    // runtimeOnly("org.slf4j:slf4j-simple")
    // testImplementation("junit:junit")
}

