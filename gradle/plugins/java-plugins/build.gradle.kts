plugins {
    `kotlin-dsl` // id("kotlin-dsl")
    // id("groovy-gradle-plugin") <-- for Groovy DSL
    // id("java-gradle-plugin") <-- for writing Plugins in Java
}

tasks.compileJava {
    // Align with Kotlin as we mix Java and Kotlin code
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:2.7.1")
}
