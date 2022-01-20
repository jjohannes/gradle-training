

plugins {
    id("org.example.product.java-application")
}

application {
    mainClass.set("org.example.app.MyApp")
}

dependencies {
    // implementation("org.example.app:business-logic")
    implementation(project(":business-logic"))
    implementation("org.apache.commons:commons-lang3:3.6")
}
