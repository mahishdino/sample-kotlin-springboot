package com.dummy.demo.todo.controller

import com.dummy.demo.todo.query.Todo
import com.dummy.demo.todo.service.TodoService
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class TodoController(private val todoService:TodoService) {
    @QueryMapping
    fun getTodo(): List<Todo> {
        return todoService.getTodo()
    }
}