package com.danielqueiroz.shoppinggql.api.graphql

import com.danielqueiroz.shoppinggql.domain.model.Client
import com.danielqueiroz.shoppinggql.domain.service.ClientService
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class QueryGraphQL(
    private val service: ClientService
) : GraphQLQueryResolver {

    fun hello() = "Hello GraphQL"

    fun client(): Client = Client(name = "Daniel Queiroz", email = "daniel@gmail.com")

    fun clientById(id: Long) = service.getOneClient(id)

    fun clients(): List<Client> = listOf(Client(1,"John", "j123@gmail.com"),
                Client(2,"Maria", "mary@gmail.com"))

}