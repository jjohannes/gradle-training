import com.bosch.tasks.CountJar

plugins {
    id("base")
    id("application")
    // id("org.springframework.boot")
    id("com.bosch.java-base")
}

tasks.compileJava {
    doFirst {
        // Add action that is executed before compile() at EXECUTION TIME
    }
    doLast {
        // Add action that is executed after compile() at EXECUTION TIME
    }
}

tasks.register("codeQualityCheck") {
    // Own Lifecycle Task
}

// tasks.endeToEndTest {
//     mustRunAfter(tasks.test)
// }
// tasks.check {
//     dependsOn(tasks.endeToEndTest)
// }


tasks.register<CountJar>("countJar") {
    group = "my group"
    description = "counts..."

    // Inputs:
    allJars.from(tasks.jar)
    allJars.from(configurations.runtimeClasspath)

    // Output:
    countFile.set(layout.buildDirectory.file("count/jar.txt"))
}

tasks.register<Zip>("bundle") {
    group = "my group"
    description = "Packages everything"

    from(tasks.jar)
    from(configurations.runtimeClasspath)

    destinationDirectory.set(layout.buildDirectory.dir("bundles"))
}

// Change the build output dir:
//   layout.buildDirectory.set(layout.projectDirectory.dir("out"))