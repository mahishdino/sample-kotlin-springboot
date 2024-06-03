package com.dummy.demo.todo.converters

import com.dummy.demo.todo.model.TodoModel
import com.dummy.demo.todo.query.Todo

fun TodoModel.toTodo():Todo{
    return Todo(
        id = this.id,
        title = this.title
    )
}