package com.dummy.demo.todo.database.dummy

import com.dummy.demo.todo.model.TodoModel
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Primary
@Component
class DummyDatabaseService : TodoDatabaseServiceInterface {
    override fun getTodo(): List<TodoModel> {
        return listOf(
            object : TodoModel {
                override val id = "1"
                override val title = "Task 1"
            }
        )
    }
}
