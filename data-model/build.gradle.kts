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

tasks.test {
    // To never have the task up-to-date
    // outputs.upToDateWhen { false }
}
// change 'build' to 'out'
// layout.buildDirectory.set(layout.projectDirectory.dir("out"))