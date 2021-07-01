plugins {
    kotlin("jvm") version "1.5.10"
}

group = "com.target"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies{
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    compileKotlin{
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin{
        kotlinOptions.jvmTarget = "1.8"
    }
}