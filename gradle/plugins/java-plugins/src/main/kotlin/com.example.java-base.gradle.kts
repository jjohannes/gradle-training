plugins {
    id("java")
    // id("checkstyle")
}

group = "com.example.app"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks.compileJava { // == tasks.named<JavaCompile>("compileJava")
    options.encoding = "UTF-8"
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

tasks.test {
    maxParallelForks = 4

    useJUnitPlatform {
        excludeTags("integrationTag")
    }
}

tasks.register<Test>("integrationTest") {
    classpath = sourceSets.test.get().runtimeClasspath
    testClassesDirs = sourceSets.test.get().output.classesDirs

    maxParallelForks = 2

    useJUnitPlatform {
        includeTags("integrationTag")
    }
}

configurations.all {
    // For SNAPSHOT dependencies
    // resolutionStrategy {
    //     cacheChangingModulesFor(0, "seconds")
    // }
}