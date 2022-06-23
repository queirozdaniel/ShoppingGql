package com.danielqueiroz.shoppinggql.api.graphql

import com.danielqueiroz.shoppinggql.domain.model.Client
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class QueryGraphQL : GraphQLQueryResolver {

    fun hello() = "Hello GraphQL"

    fun client(): Client = Client(name = "Daniel Queiroz", email = "daniel@gmail.com")

    fun clients(): List<Client> = listOf(Client("John", "j123@gmail.com"), Client("Maria", "mary@gmail.com"))

}