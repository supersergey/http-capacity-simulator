plugins {
    application
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
}

application {
    mainClass.set("com.example.http.capacity.simulator.delay.LauncherKt")
}

tasks.withType<JavaExec> {
    jvmArgs = listOf("-Xms1g", "-Xmx2g")
}