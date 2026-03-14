plugins {
    kotlin("jvm") version "2.3.0"
    kotlin("plugin.serialization") version "2.3.0"
    id("maven-publish")

    `java-library`
}

group = "me.binarywriter"
version = "1.0.3"

base {
    archivesName.set("discord-webhooks")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    api("com.squareup.okhttp3:okhttp:5.3.2")
    api("org.jetbrains.kotlinx", "kotlinx-serialization-json", "1.10.0")
}

java {
    withSourcesJar()
    withJavadocJar()
}

tasks.jar {
    manifest {
        attributes(
            "Implementation-Title" to "discord-webhooks",
            "Implementation-Version" to version,
        )
    }
}
