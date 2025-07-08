**Kotlin Multiplatform (KMP) Library Sample**
This is a sample Kotlin Multiplatform (KMP) library project, designed to be published to a private Maven repository. The library can be integrated into both Android and iOS projects.

**Usage**
📦 Android
To use this library in an Android project, add the following dependency to your build.gradle file:

**gradle**
dependencies {
    implementation("com.yourcompany:your-library-name:version")
}
🍏 iOS
For iOS integration, this library is distributed via CocoaPods. Add the following to your Podfile:

**Pods file**
pod 'YourLibraryName', :git => 'https://your-repo-url.git'
Run:
sh
pod install
