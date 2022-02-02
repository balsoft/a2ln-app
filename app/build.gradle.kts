plugins {
    id("com.android.application")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "dev.patri9ck.a2ln"
        minSdk = 27
        targetSdk = 31

        versionCode = 3
        versionName = "1.0.2"
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
}

dependencies {
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("com.google.android.material:material:1.4.0")
    implementation("org.zeromq:jeromq:0.5.2")
}
