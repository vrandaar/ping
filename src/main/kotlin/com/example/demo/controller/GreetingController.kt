package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greet")
class GreetingController {

    @GetMapping("/hello")
    fun hello(
        @RequestParam(name = "name", defaultValue = "World") name: String
    ): String {
        return "hello $name"
    }

}