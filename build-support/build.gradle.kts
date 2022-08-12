plugins {
  `kotlin-dsl`
}

repositories {
  mavenCentral()
}

dependencies {
  add("compileOnly", kotlin("gradle-plugin"))
  add("compileOnly", kotlin("gradle-plugin-api"))
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
}

gradlePlugin {
  plugins {
    create("build-support") {
      id = "build-support"
      implementationClass = "BuildSupport"
    }
  }
}
