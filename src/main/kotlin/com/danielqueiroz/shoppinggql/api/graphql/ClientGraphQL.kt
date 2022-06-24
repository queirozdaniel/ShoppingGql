package com.danielqueiroz.shoppinggql.api.graphql

import com.danielqueiroz.shoppinggql.domain.model.Client
import com.danielqueiroz.shoppinggql.domain.service.ClientService
import graphql.kickstart.tools.GraphQLMutationResolver
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class ClientGraphQL(
    private val clientService: ClientService
) : GraphQLQueryResolver, GraphQLMutationResolver {

    fun client(id: Long) = clientService.getOne(id)

    fun clients(): List<Client> = clientService.getAll()

    fun createClient(name: String, email: String) = clientService.save(Client(id = null,name, email))

    fun updateClient(id: Long, name: String, email: String): Client {
        return clientService.update(Client(id, name, email))
    }

    fun deleteClient(id: Long) = clientService.delete(id)
}