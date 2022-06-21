package com.danielqueiroz.shoppinggql.api.config

import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class QueryGraphQL : GraphQLQueryResolver {

    fun hello() = "Hello GraphQL"
}