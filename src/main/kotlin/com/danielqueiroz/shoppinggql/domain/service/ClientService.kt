package com.danielqueiroz.shoppinggql.domain.service

import com.danielqueiroz.shoppinggql.domain.model.Client

interface ClientService {

    fun getOne(id: Long): Client
    fun getAll(): List<Client>
    fun save(client: Client): Client
    fun update(client: Client): Client
    fun delete(id: Long): Boolean
}