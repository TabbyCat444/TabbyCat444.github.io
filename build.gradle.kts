import org.gradle.internal.execution.caching.CachingState.enabled
import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType

plugins {
    kotlin("multiplatform") version "2.0.0"
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0"
    id("org.jetbrains.compose") version "1.6.11"
}

repositories {
    mavenCentral()
}

kotlin {
    js(KotlinJsCompilerType.IR) {
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
                outputFileName = "tabitha-tallent-portfolio.js"
            }
        }
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(compose.runtime)
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.1")
            }
        }
    }
}