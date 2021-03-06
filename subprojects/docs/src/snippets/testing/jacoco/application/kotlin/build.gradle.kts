// tag::application-configuration[]
plugins {
    application
    jacoco
}

application {
    mainClass.set("org.gradle.MyMain")
}

jacoco {
    applyTo(tasks.run.get())
}

tasks.register<JacocoReport>("applicationCodeCoverageReport") {
    executionData(tasks.run.get())
    sourceSets(sourceSets.main.get())
}
// end::application-configuration[]

repositories {
    mavenCentral()
}
