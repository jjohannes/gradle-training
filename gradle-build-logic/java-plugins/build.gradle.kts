
plugins {
    `kotlin-dsl`
    id("maven-publish")
}

group = "org.example.product"
version = "1.0"

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:2.7.0")
}

// gradlePlugin {
//     plugins.create("myJavaLibrary") {
//         implementationClass = "org.example.MyJavaLibraryPlugin"
//         id = "org.example.product.java-library"
//     }
// }



