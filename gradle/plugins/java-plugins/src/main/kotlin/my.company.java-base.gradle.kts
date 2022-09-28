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

tasks.test {

}
