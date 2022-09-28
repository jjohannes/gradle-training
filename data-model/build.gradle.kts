plugins {
    id("my.company.java-library")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")

    integrationTestImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    integrationTestImplementation(project(path))
}

