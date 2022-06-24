package com.danielqueiroz.shoppinggql.api.graphql

import com.danielqueiroz.shoppinggql.domain.model.Client
import com.danielqueiroz.shoppinggql.domain.service.ClientService
import graphql.kickstart.tools.GraphQLMutationResolver
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class ClientGraphQL(
    private val service: ClientService
) : GraphQLQueryResolver, GraphQLMutationResolver {

    fun client(id: Long) = service.getOneClient(id)
    fun clients(): List<Client> = service.getAllClients()
    fun createClient(name: String, email: String) = service.saveClient(Client(id = null,name, email))
}