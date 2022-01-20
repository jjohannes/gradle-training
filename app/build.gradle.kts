plugins {
    id("org.example.product.java-application")
}

application {
    mainClass.set("org.example.app.MyApp")
}

// tasks.named<org.example.GenerateStartScript>("generateStartScript") {
tasks.generateStartScript {
    mainClass.set("org.example.app.MyApp")
}

dependencies {
    // implementation("org.example.app:business-logic")
    implementation(project(":business-logic"))
    implementation("org.apache.commons:commons-text")
    implementation("org.apache.commons:commons-lang3")
}

configurations {
    compileClasspath.get().shouldResolveConsistentlyWith(runtimeClasspath.get())
}
