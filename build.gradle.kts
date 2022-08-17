import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.2"
    id("io.spring.dependency-management") version "1.0.12.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"

    id("org.jetbrains.kotlinx.kover") version "0.6.0-Beta"
//    id("org.sonarqube") version "3.3"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

kover {
    engine.set(kotlinx.kover.api.DefaultJacocoEngine)
}

//sonarqube {
//    properties {
//        property("sonar.host.url", "http://localhost:9000")
//        property("sonar.coverage.jacoco.xmlReportPaths", "${project.buildDir}/reports/kover/xml/report.xml")
//        property("sonar.projectName", "arva")
//        property("sonar.projectKey", "arva123")
//        property("sonar.login", "admin")
//        property("sonar.password", "admin1")
////        property("sonar.organization", "Edgelab")
//    }
//}
//
//
//tasks.named("sonarqube").configure {
//    dependsOn("koverReport")
//}

