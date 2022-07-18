plugins {
    `kotlin-dsl` // id("kotlin-dsl")
    // `groovy-gradle-plugin`
    // `java-gradle-plugin`
}

tasks.compileJava {
    // Align with Kotlin as we mix Java and Kotlin code
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
}

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:2.7.1")
}
