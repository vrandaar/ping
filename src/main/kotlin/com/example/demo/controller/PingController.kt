package com.example.demo.controller

import com.example.demo.service.PingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/v1")
class PingController {
    @Autowired
    private val pingService: PingService = PingService()
    @GetMapping("/ping")
    fun ping(): String {
        return pingService.pingResponse()
    }
}