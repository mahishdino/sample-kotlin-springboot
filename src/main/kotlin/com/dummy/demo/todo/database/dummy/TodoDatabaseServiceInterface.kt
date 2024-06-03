package com.dummy.demo.todo.database.dummy

import com.dummy.demo.todo.model.TodoModel

interface TodoDatabaseServiceInterface {

   fun getTodo():List<TodoModel>
}