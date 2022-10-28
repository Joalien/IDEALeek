import org.jetbrains.intellij.tasks.RunPluginVerifierTask

val ideaVersion: String by project
val downloadIdeaSources: String by project
val publishUsername: String by project
val publishPassword: String by project
val publishChannels: String by project
val testPlugins: String by project

repositories {
    mavenCentral()
}

plugins {
    id("org.jetbrains.intellij") version "1.5.3"
    id("org.sonarqube") version "3.1.1"
    jacoco
    java
}

apply {
    plugin("org.jetbrains.intellij")
}

dependencies {
    implementation("org.jsoup", "jsoup", "1.13.1")
}

intellij {
    version.set(ideaVersion)
    downloadSources.set(downloadIdeaSources.toBoolean())
    updateSinceUntilBuild.set(false)
}

tasks.jacocoTestReport {
    reports {
        xml.isEnabled = true
        csv.isEnabled = false
        html.isEnabled = false
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType(JavaCompile::class) {
    options.encoding = "UTF-8"
}

sourceSets.main {
    java.srcDirs("src", "gen")
    resources.srcDir("resources")
}

sourceSets.test {
    java.srcDir("test")
    resources.srcDir("testdata")
}
