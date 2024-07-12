package com.example.demo.controller

import com.example.demo.service.PingService
import com.example.demo.service.TimeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/app")
class PingController(@Autowired val pingService: PingService,val timeService: TimeService) {
    @GetMapping("/ping")
    fun ping(): String {
        val response = pingService.ping() + timeService.getTime()
        return response
    }
}