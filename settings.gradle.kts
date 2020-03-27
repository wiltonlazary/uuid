pluginManagement {
    repositories {
        gradlePluginPortal()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
    }
}
buildCache {
    local {
        directory = "$rootDir/build/cache/"
        removeUnusedEntriesAfterDays = 30
    }
}
rootProject.name = "uuid"
