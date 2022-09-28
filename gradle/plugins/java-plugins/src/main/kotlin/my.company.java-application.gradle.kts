plugins {
    id("my.company.java-base")
    id("application")
}

tasks.register<Zip>("packageApp") {
    into("libs") {
        from(tasks.jar)
        from(configurations.runtimeClasspath)
    }
    destinationDirectory.set(layout.buildDirectory.dir("packages"))
    // from(tasks.startScripts)
}