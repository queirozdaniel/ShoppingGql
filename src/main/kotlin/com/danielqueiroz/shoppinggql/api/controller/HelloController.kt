package com.danielqueiroz.shoppinggql.api.controller

import org.springframework.stereotype.Controller

@Controller("/hello")
class HelloController {

    fun hello(): String = "Hello Rest nove"

}