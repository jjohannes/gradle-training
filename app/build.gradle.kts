plugins {
    id("com.example.java-application")
}

// application {
//     mainClass.set("com.example.app.ExampleApplication")
// }

dependencies {
    implementation(project(":business-logic"))
    implementation(project(":data-model"))

    implementation(libs.spring.boot)

    developmentOnly("org.springframework.boot:spring-boot-devtools:2.7.1")
    // To use hot reload you typically run two Gradle processes in parallel (possible triggered through IntelliJ)
    //   :app:bootRun  <- This keeps running and will hot-reload classes when changed
    //   :app:compileJava <- Compile code after changes

    // implementation(libs.commons.lang)
}
