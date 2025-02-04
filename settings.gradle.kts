pluginManagement {
    repositories {
        maven(url = "https://repo.spring.io/milestone")
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "clovy-server"
include("api")
include("business")
include("common")
include("core")
include("infra")
