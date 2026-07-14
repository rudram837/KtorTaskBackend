package com.tutorial.Model

import kotlinx.serialization.Serializable
import java.util.UUID


enum class Priority {
    LOW, MEDIUM, HIGH
}


@Serializable
data class Task(
    val name: String,
    val description: String,
    val priority: Priority,
    val id: Int
//    val id: String = UUID.randomUUID().toString(),
)
