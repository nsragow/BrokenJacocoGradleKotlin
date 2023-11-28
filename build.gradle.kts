import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

plugins {
    id("idea")
    kotlin("jvm") version "1.6.21"
    jacoco
}

repositories {
    mavenCentral()
}


tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}