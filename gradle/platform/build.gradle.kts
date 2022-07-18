plugins {
    id("java-platform")
}

group = "com.example"

javaPlatform.allowDependencies()
dependencies {
    // api(platform("com.jackson:jackson-bom:2.7.4"))
}

dependencies.constraints {
    api("org.apache.commons:commons-lang3:3.12.0")
}
