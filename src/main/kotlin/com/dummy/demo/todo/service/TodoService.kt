package com.dummy.demo.todo.service

import com.dummy.demo.todo.converters.toTodo
import com.dummy.demo.todo.database.dummy.TodoDatabaseServiceInterface
import com.dummy.demo.todo.query.Todo
import org.springframework.stereotype.Service

@Service
class TodoService(private val todoDatabaseService: TodoDatabaseServiceInterface) {
    fun getTodo(): List<Todo> {
        return todoDatabaseService.getTodo().map { it.toTodo() }
    }
}