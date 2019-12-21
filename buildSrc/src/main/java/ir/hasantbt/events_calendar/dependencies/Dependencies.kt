package ir.hasantbt.events_calendar.dependencies

object Versions {
    const val min_sdk = 21
    const val target_sdk = 29
    const val compile_sdk = 29
    const val build_tools = "29.0.2"

    object Gradle {
        const val android_gradle_plugin = "4.0.0-alpha06"
    }

    object Kotlin {
        const val common = "1.3.61"
    }

    object AndroidX {
        object Core {
            const val core_ktx = "1.1.0"
        }
        object Appcompat {
            const val common = "1.1.0"
        }
        object Navigation {
            const val common = "2.1.0"
        }
        object Junit {
            const val core = "1.1.1"
        }
        object Espresso {
            const val core = "3.2.0"
        }
        object Legacy {
            const val common = "1.0.0"
        }
        object Material {
            const val common = "1.0.0"
        }
        object ConstrainLayout {
            const val common = "1.1.3"
        }
        object Lifecycle {
            const val extensions = "2.1.0"
        }
    }
    object Junit {
        const val common = "4.12"
    }
}

object Dependencies {
    object Gradle {
        const val android_plugin = "com.android.tools.build:gradle:${Versions.Gradle.android_gradle_plugin}"
    }

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.Kotlin.common}"
        const val gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin.common}"
    }

    object AndroidX {
        object Core {
            const val core_ktx = "androidx.core:core-ktx:${Versions.AndroidX.Core.core_ktx}"
        }
        object Appcompat {
            const val common = "androidx.appcompat:appcompat:${Versions.AndroidX.Appcompat.common}"
        }
        object Navigation {
            private const val pkg = "androidx.navigation"
            private val ver = Versions.AndroidX.Navigation

            const val sage_args = "${pkg}:navigation-safe-args-gradle-plugin:${ver.common}"
            const val fragment = "${pkg}:navigation-fragment:${ver.common}"
            const val fragment_ktx = "${pkg}:navigation-fragment-ktx:${ver.common}"
            const val ui = "${pkg}:navigation-ui:${ver.common}"
            const val ui_ktx = "${pkg}:navigation-ui-ktx:${ver.common}"
        }
        object Legacy {
            const val common = "androidx.legacy:legacy-support-v4:${Versions.AndroidX.Legacy.common}"
        }
        object Material {
            const val common = "com.google.android.material:material:${Versions.AndroidX.Material.common}"
        }
        object ConstrainLayout {
            const val common = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.ConstrainLayout.common}"
        }
        object Lifecycle {
            const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.AndroidX.Lifecycle.extensions}"
        }
    }
}

object TestDependencies {
    object Junit {
        const val common = "junit:junit:${Versions.Junit.common}"
    }
    object AndroidX {
        const val junit = "androidx.test.ext:junit:${Versions.AndroidX.Junit.core}"
        object Espresso {
            const val core = "androidx.test.espresso:espresso-core:${Versions.AndroidX.Espresso.core}"
        }
    }
}