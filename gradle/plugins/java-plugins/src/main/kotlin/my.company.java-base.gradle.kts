plugins {
    id("java")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(19))
}

tasks.build {
    group = "myown"
}

tasks.register("qualityCheck") {
    group = "myown"
    description = "runs all checks (but not tests)"

    // dependsOn(tasks.checkstyle)
    // dependsOn(tasks.spotbugs)
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}
// Configure a single task:
//
// tasks.compileJava {
//     options.encoding = "UTF-8"
// }
// tasks.named<JavaCompile>("compileTestJava") {
//     options.encoding = "UTF-8"
// }

// DO NOT USE!!!
// task("compileTestJava") {
// }
// tasks.getByName<JavaCompile>("compileTestJava") {
//     options.encoding = "UTF-8"
// }
// tasks.withType<JavaCompile>() { // <- NO .configureEach{}
//    options.encoding = "UTF-8"
//}


val integrationTest = sourceSets.create("integrationTest")

tasks.test {
    useJUnitPlatform {
        // excludeTags("slow")
    }

    exclude("my.company.*")

    // JUnit 5
    // useJUnit() // JUnit 4
    maxParallelForks = 4
}

tasks.register<Test>("integrationTest") {
    classpath = integrationTest.runtimeClasspath
    testClassesDirs = integrationTest.output

    useJUnitPlatform {
        // includeTags("slow")
    }
}

// testing {
//     suites.named<JvmTestSuite>("test") {
//         useJUnitJupiter()
//     }
//    // suites.create<JvmTestSuite>("integrationTest")
// }
