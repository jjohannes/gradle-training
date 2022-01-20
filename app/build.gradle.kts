plugins {
    id("application")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

application {
    mainClass.set("org.example.app.MyApp")
}

dependencies {
    implementation(project(":business-logic"))
    implementation("org.apache.commons:commons-lang3:3.6")
}
