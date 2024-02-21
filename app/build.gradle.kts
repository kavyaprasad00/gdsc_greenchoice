plugins {
    id("com.android.application")
    id("com.google.gms.google-services")

}
android {

    namespace = "gdsc.greenchoice3"
    compileSdk = 34

    buildFeatures {
        dataBinding ; true
    }
    buildFeatures {
        viewBinding = true
    }

    defaultConfig {
        applicationId = "gdsc.greenchoice3"
        minSdk = 26
        targetSdk = 34
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.navigation:navigation-fragment:2.7.5")
    implementation("androidx.navigation:navigation-ui:2.7.5")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    // Firebase
    implementation(platform("com.google.firebase:firebase-bom:32.7.1"))
    implementation("com.google.firebase:firebase-analytics")
    implementation("com.firebaseui:firebase-ui-auth:8.0.2")
    implementation("com.firebaseui:firebase-ui-storage:8.0.2")
//    implementation ("com.android.support.constraint:constraint-layout:1.1.3");
}}