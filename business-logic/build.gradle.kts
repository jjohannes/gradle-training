plugins {
    id("my.company.java-library")
}

dependencies {
    implementation(project(":data-model"))
    implementation("org.apache.commons:commons-lang3:3.12.0")
}
