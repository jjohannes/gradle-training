plugins {
    id("java-platform")
}

group = "com.example"

javaPlatform.allowDependencies()

dependencies {
    api(platform("om.fasterxml.jackson:jackson-bom:2.13.3"))
}

dependencies.constraints {
    api("org.apache.commons:commons-lang3:3.12.0")
}
