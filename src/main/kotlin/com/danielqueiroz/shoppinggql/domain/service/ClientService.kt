package com.danielqueiroz.shoppinggql.domain.service

import com.danielqueiroz.shoppinggql.domain.model.Client

interface ClientService {

    fun getOneClient(id: Long): Client
    fun getAllClients(): List<Client>
    fun saveClient(client: Client): Client
}