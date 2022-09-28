plugins {
    `kotlin-dsl` // id("kotlin-dsl")
    // id("maven-publish")
}

group = "my.company"

java.toolchain.languageVersion.set(JavaLanguageVersion.of(8))

dependencies {
    // implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
}
