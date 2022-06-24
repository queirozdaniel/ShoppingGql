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

    override fun getOne(id: Long): Client {
        return repository.findById(id).orElseThrow {
            RuntimeException("Não encontrou um client com Id informado") 
            TODO("Implementar erro")
        }
    }

    override fun getAll(): List<Client> {
        return repository.findAll()
    }

    @Transactional
    override fun save(client: Client): Client {
        return repository.save(client)
    }

    override fun update(client: Client): Client {
        if (repository.findById(client.id!!).isPresent)
            return repository.save(client)
        else
           throw RuntimeException("Cliente não encontrado")
    }

    override fun delete(id: Long): Boolean {
        val clientReturned = repository.findById(id)
        if (clientReturned.isPresent) {
            repository.delete(clientReturned.get())
            return true
        } else {
            return false
        }
    }

}