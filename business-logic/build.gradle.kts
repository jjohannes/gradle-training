plugins {
    id("com.bosch.java-library")
}

dependencies {
    api(project(":data-model"))

    implementation("org.apache.commons:commons-lang3:3.12.0")
}
