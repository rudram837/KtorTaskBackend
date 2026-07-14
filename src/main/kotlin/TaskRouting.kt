package com.tutorial

import com.tutorial.Model.Task
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.request.receive
import io.ktor.server.response.respond
import io.ktor.server.routing.delete
import io.ktor.server.routing.get
import io.ktor.server.routing.post
import io.ktor.server.routing.put
import io.ktor.server.routing.routing
import java.util.UUID


private val list = mutableListOf<Task>()
private var nextId = 1

fun Application.configureTaskRouting() {

    routing {

        get ("/task") {
            call.respond(list)
        }

            post ("/task") {
                val task = call.receive<Task>()
                val updateTask = task.copy(
                    id = nextId++,
                )
                list.add(updateTask)
                call.respond(updateTask)
            }

        delete ("/task/{id}") {
            val taskId = call.parameters["id"]?.toIntOrNull() ?: return@delete call.respond(HttpStatusCode.BadRequest)
            val task = list.find { it.id == taskId }

            if (task != null) {

                list.remove(task)
                call.respond(HttpStatusCode.OK)
            } else {
                call.respond(HttpStatusCode.NotFound)
            }
        }

        put("/task/{id}") {

            val id = call.parameters["id"]?.toIntOrNull() ?: return@put call.respond(HttpStatusCode.BadRequest)

            val index = list.indexOfFirst { it.id == id }

            if (index == -1) {
                call.respond(HttpStatusCode.NotFound)
                return@put
            }

            val frontEndTask = call.receive<Task>()

            val updatedTask = frontEndTask.copy(id = id)

            list[index] = updatedTask

            call.respond(updatedTask)
        }
    }
}