plugins {
    id("org.example.product.java-library")
}

dependencies {
    api(project(":data-model"))
    implementation("org.apache.commons:commons-lang3")
}