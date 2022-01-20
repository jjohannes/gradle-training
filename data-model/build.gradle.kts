plugins {
    id("org.example.product.java-library")
}

tasks.compileJava {
    // Configure task directly instead of extension
    options.release.set(11)
}

tasks.register<Zip>("zipCode") {
    from(tasks.compileJava)
    // from("build/classes")) <-- DON'T DO THIS!
    destinationDirectory.set(layout.buildDirectory.dir("myOwn"))
}

dependencies {
//    testImplementation("...")
}

val integrationTest = tasks.register<Test>("integrationTest") {
    classpath = sourceSets.test.get().output.classesDirs + // classpath (dependencies)
            configurations.testRuntimeClasspath.get()      // the test classes themselves
    testClassesDirs = sourceSets.test.get().output.classesDirs

    useJUnitPlatform() // Look for JUnit5 tests!

    filter {
        includeTestsMatching("*IT*")
    }
}

tasks.test {
    maxParallelForks = 10
    filter {
        excludeTestsMatching("*IT*")
    }
}

tasks.register("testsOnCi") {
    dependsOn(integrationTest)
}

tasks.test {
    // To never have the task up-to-date
    // outputs.upToDateWhen { false }
}
// change 'build' to 'out'
// layout.buildDirectory.set(layout.projectDirectory.dir("out"))