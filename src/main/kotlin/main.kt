package com.tutorial

import io.ktor.server.engine.*
import io.ktor.server.application.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.plugins.contentnegotiation.*
import io.netty.handler.codec.DefaultHeaders

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.main() {
    install(ContentNegotiation) {
        json()
    }
    configureRouting()
    configureTaskRouting()
}