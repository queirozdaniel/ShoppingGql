package com.danielqueiroz.shoppinggql.domain.repository

import com.danielqueiroz.shoppinggql.domain.model.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository : JpaRepository<Client, Long> {

}