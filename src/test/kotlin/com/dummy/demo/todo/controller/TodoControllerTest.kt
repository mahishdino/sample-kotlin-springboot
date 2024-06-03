package com.dummy.demo.todo.controller

import com.dummy.demo.graphql.AUTH_TOKEN
import com.dummy.demo.graphql.GraphQLTest
import com.fasterxml.jackson.databind.JsonNode
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TodoControllerTest(@Autowired private val graphQLTest: GraphQLTest)
{
    @Test
    fun `Get the Todo Data`()
    {
        val questionInfoEntity = graphQLTest.tester.mutate().webTestClient {
            it.defaultHeader("Authorization", AUTH_TOKEN)
        }.build().documentName("getTodo").execute()
            .path("getTodo")
            .entity(JsonNode::class.java)
            .also {
                println(it.get().toPrettyString())
            }
    }

}