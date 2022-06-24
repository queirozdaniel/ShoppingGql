package com.danielqueiroz.shoppinggql.api.graphql

import com.danielqueiroz.shoppinggql.domain.model.Client
import com.danielqueiroz.shoppinggql.domain.service.ClientService
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class QueryGraphQL(
    private val service: ClientService
) : GraphQLQueryResolver {

    fun client(id: Long) = service.getOneClient(id)

    fun clients(): List<Client> = service.getAllClients()

}