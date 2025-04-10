pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        maven {
            url = uri("https://maven.pkg.github.com/Timpuneen/chatlibrary")
            credentials {
                username = "Timpuneen"
                password = "ghp_nTzHBTvu16slW2Jr"+"IOdi5KNWZJs4HA12PAtV"
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/Timpuneen/chatlibrary")
            credentials {
                username = "Timpuneen"
                password = "ghp_nTzHBTvu16slW2Jr"+"IOdi5KNWZJs4HA12PAtV"
            }
        }
        google()
        mavenCentral()
    }
}

rootProject.name = "chatlibrary_Implementation"
include(":app")

