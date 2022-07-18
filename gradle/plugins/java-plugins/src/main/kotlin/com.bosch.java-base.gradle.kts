plugins {
    id("java")
    id("checkstyle")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks.compileJava { // == tasks.named<JavaCompile>("compileJava")
    options.encoding = "UTF-8"
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

