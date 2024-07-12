package com.example.demo.service

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

interface PingService {
    fun ping(): String
}

@Service
@Profile("default")
class DefaultPingService: PingService {
    override fun ping(): String {
        return "pong "
    }
}

@Service
@Profile("dev")
class DevPingService: PingService {
    override fun ping(): String {
        return "Hello, Current Time is "
    }
}

@Service
@Profile("prod")
class ProdPingService: PingService {
    override fun ping(): String {
        return "Hallo, die aktuelle Zeit ist "
    }
}

@Service
@Profile("qa")
class QaPingService: PingService {
    override fun ping(): String {
        return "Bonjour, l'heure actuelle est "
    }
}