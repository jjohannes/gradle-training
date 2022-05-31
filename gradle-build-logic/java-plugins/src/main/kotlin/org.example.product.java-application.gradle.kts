import org.example.GenerateStartScript

plugins {
    id("org.example.product.java-base")
    id("application")
    id("org.springframework.boot")
}

tasks.register<GenerateStartScript>("generateStartScript") {
    classpath.from(configurations.runtimeClasspath)
    classpath.from(tasks.jar)
    scriptFile.set(layout.buildDirectory.file("a/v/c/start.sh"))
}

