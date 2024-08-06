pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Structure Example"
include(":app")
include(":core-ui")
include(":feature:splash")
include(":core")
include(":data-feature:visit:data")
include(":data-feature:visit:domain")
include(":data-feature:customer:data")
include(":data-feature:customer:domain")
include(":data-feature:master:domain")
