# CraftLib
![Modrinth Downloads](https://img.shields.io/modrinth/dt/craftlib?style=for-the-badge&logo=modrinth)
![Modrinth Version](https://img.shields.io/modrinth/v/craftlib?style=for-the-badge) 
![GitHub last commit](https://img.shields.io/github/last-commit/Blonicx/CraftLib?display_timestamp=author&style=for-the-badge&logo=github)

## About
CraftLib is a utility Library that helps developers have a consistent API even if the Mojang API changes intern.
It provides Multi Version Solutions that make the life for multi-version Minecraft mods easier and more Stable

## Installation
You can use CraftLib in your Project using the Modrinth Maven Repo.

build.gradle:
```groovy
repositories {
    exclusiveContent {
        forRepository {
            maven {
                name = "Modrinth"
                url = "https://api.modrinth.com/maven"
            }
        }
        filter {
            includeGroup "maven.modrinth"
        }
    }
}
```

```groovy
dependencies {
  modImplementation "maven.modrinth:craftlib:VERSION"
}
```