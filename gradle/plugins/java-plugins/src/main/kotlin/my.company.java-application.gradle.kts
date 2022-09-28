import my.company.JarCount

plugins {
    id("my.company.java-base")
    id("application")
}

val countJars = tasks.register<JarCount>("countJars") {
    allJars.from(tasks.jar)
    allJars.from(configurations.runtimeClasspath)

    countFile.set(layout.buildDirectory.file("jarAnalysis/count.txt"))
}

tasks.register<Zip>("packageApp") {
    into("libs") {
        from(tasks.jar)
        from(configurations.runtimeClasspath)
        // from(layout.projectDirectory.dir("img/abc.png"))
    }
    from(countJars)
    destinationDirectory.set(layout.buildDirectory.dir("packages"))
}
