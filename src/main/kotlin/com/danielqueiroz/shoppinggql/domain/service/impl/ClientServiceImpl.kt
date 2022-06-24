package com.danielqueiroz.shoppinggql.domain.service.impl

import com.danielqueiroz.shoppinggql.domain.model.Client
import com.danielqueiroz.shoppinggql.domain.repository.ClientRepository
import com.danielqueiroz.shoppinggql.domain.service.ClientService
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class ClientServiceImpl(
    private val repository: ClientRepository
) : ClientService {

    override fun getOneClient(id: Long): Client {
        return repository.findById(id).orElseThrow {
            RuntimeException("Não encontrou um client com Id informado") //TODO Implementar Exception para NotFound
        }
    }

    override fun getAllClients(): List<Client> {
        return repository.findAll()
    }

    @Transactional
    override fun saveClient(client: Client): Client {
        return repository.save(client)
    }
}