
const val kotlinVersion = "1.3.72"

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "3.6.4"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
}

object AndroidSdk {
    const val min = 21
    const val compile = 29
    const val target = 29
}

object DefaultConfig {

    object BuildType {
        const val release = "release"
    }

    const val applicationId = "dev.ilhamsuaib.gradlekts"
    const val versionCode = 1
    const val versionName = "1.0"
}

object Libraries {

    object Versions {
        const val appCompat = "1.2.0"
        const val constraintLayout = "1.1.3"
        const val ktxCore = "1.3.1"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktxCore}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
}

object TestLibraries {

    object Versions {
        const val jUnit = "4.12"
        const val jUnitExt = "1.1.1"
        const val espressoCore = "3.2.0"
    }

    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val jUnitExt = "androidx.test.ext:junit:${Versions.jUnitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}