object Dependencies {
    object Versions {
        const val Activity = "1.6.0"
        const val AppCompat = "1.5.1"
        const val CardView = "1.0.0"
        const val CommonsCompress = "1.21"
        const val Compose = "1.2.1"
        const val ConstraintLayout = "2.1.4"
        const val Core = "1.9.0"
        const val Desugar = "1.1.5"
        const val DocumentFile = "1.0.1"
        const val Flexbox = "3.0.0"
        const val Fragment = "1.5.3"
        const val Gradle = "7.2.2"
        const val Gson = "2.8.6"
        const val HiltX = "1.0.0"
        const val Hilt = "2.42"
        const val Junit = "4.12"
        const val Kotlin = "1.7.20"
        const val KotlinxCoroutinesRx = "1.6.4"
        const val LifecycleViewModel = "2.5.1"
        const val Material = "1.7.0"
        const val Picasso = "2.71828"
        const val Preference = "1.2.0"
        const val RecyclerView = "1.2.1"
        const val Room = "2.4.3"
        const val RxAndroid = "2.1.1"
        const val RxJava = "2.2.10"
        const val Splashscreen = "1.0.0"
        const val SwipeRefreshLayout = "1.1.0"
        const val Work = "2.7.1"
        const val Markwon = "4.6.2"
        const val Retrofit = "2.9.0"
        const val Xz = "1.9"
    }

    object GradlePlugins {
        const val gradle = "com.android.tools.build:gradle:${Versions.Gradle}"
        const val hiltAndroid = "com.google.dagger:hilt-android-gradle-plugin:${Versions.Hilt}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin}"
    }

    object Tools {
        const val desugarJdkLibs = "com.android.tools:desugar_jdk_libs:${Versions.Desugar}"
    }

    object Kotlin {
        const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.Kotlin}"
    }

    object AndroidX {
        const val activity = "androidx.activity:activity-ktx:${Versions.Activity}"
        const val activityCompose = "androidx.activity:activity-compose:${Versions.Activity}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.AppCompat}"
        const val cardView = "androidx.cardview:cardview:${Versions.CardView}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.ConstraintLayout}"
        const val core = "androidx.core:core-ktx:${Versions.Core}"
        const val documentFile = "androidx.documentfile:documentfile:${Versions.DocumentFile}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.Fragment}"
        const val hiltWork = "androidx.hilt:hilt-work:${Versions.HiltX}"
        const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LifecycleViewModel}"
        const val lifecycleViewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.LifecycleViewModel}"
        const val preference = "androidx.preference:preference-ktx:${Versions.Preference}"
        const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.RecyclerView}"
        const val room = "androidx.room:room-runtime:${Versions.Room}"
        const val roomRxJava = "androidx.room:room-rxjava2:${Versions.Room}"
        const val splashscreen = "androidx.core:core-splashscreen:${Versions.Splashscreen}"
        const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.SwipeRefreshLayout}"
        const val work = "androidx.work:work-runtime-ktx:${Versions.Work}"
        const val workRxJava = "androidx.work:work-rxjava2:${Versions.Work}"
        const val material = "com.google.android.material:material:${Versions.Material}"
    }

    object Compose {
        const val foundation = "androidx.compose.foundation:foundation:${Versions.Compose}"
        const val material = "androidx.compose.material:material:${Versions.Compose}"
        const val ui = "androidx.compose.ui:ui:${Versions.Compose}"
        const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.Compose}"
        const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.Compose}"
    }

    object ThirdParty {
        const val masterSwitchPreference = ":masterswitch"
        const val flexbox = "com.google.android.flexbox:flexbox:${Versions.Flexbox}"
        const val gson = "com.google.code.gson:gson:${Versions.Gson}"
        const val hilt = "com.google.dagger:hilt-android:${Versions.Hilt}"
        const val kotlinxCoroutinesRx = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${Versions.KotlinxCoroutinesRx}"
        const val picasso = "com.squareup.picasso:picasso:${Versions.Picasso}"
        const val markwon = "io.noties.markwon:core:${Versions.Markwon}"
        const val markwonImagePicasso = "io.noties.markwon:image-picasso:${Versions.Markwon}"
        const val markwonLinkify = "io.noties.markwon:linkify:${Versions.Markwon}"
        const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.RxJava}"
        const val rxJavaAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.RxAndroid}"
        const val commonsCompress = "org.apache.commons:commons-compress:${Versions.CommonsCompress}"
        const val xz = "org.tukaani:xz:${Versions.Xz}"
    }

    object GitHub {
        const val retrofit = "com.squareup.retrofit2:adapter-rxjava2:${Versions.Retrofit}"
        const val retrofitAdapterRxJava = "com.squareup.retrofit2:adapter-rxjava2:${Versions.Retrofit}"
        const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:${Versions.Retrofit}"
    }

    object Kapt {
        const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.HiltX}"
        const val hiltCompilerAndroid = "com.google.dagger:hilt-android-compiler:${Versions.Hilt}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.Room}"
    }

    object Testing {
        const val junit = "junit:junit:${Versions.Junit}"
    }
}