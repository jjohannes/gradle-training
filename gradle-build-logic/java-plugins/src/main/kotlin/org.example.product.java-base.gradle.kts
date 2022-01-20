plugins {
    id("java")
}

group = "org.example.product"
version = "1.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies.constraints {
    implementation("org.apache.commons:commons-text:1.5")
    implementation("org.apache.commons:commons-lang3:3.8") // or '3.8!!' for strict
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}