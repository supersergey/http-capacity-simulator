plugins {
    application
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}

application {
    mainClass.set("com.example.http.capacity.simulator.blocking.BlockingLauncherKt")
}

tasks.withType<JavaExec> {
    jvmArgs = listOf("-Xms1g", "-Xmx2g")
}