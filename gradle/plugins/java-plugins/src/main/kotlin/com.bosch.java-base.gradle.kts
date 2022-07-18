plugins {
    id("java")
    id("checkstyle")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

tasks.compileJava {

}
