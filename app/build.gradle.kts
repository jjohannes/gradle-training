plugins {
    id("com.bosch.java-application")
}

application {
    mainClass.set("com.example.app.ExampleApplication")
}

dependencies {
    implementation(project(":business-logic"))
    implementation(project(":data-model"))
}
