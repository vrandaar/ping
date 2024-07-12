package com.example.demo.controller

import com.example.demo.service.PingService
import com.example.demo.service.TimeService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations

class PingControllerTest {

    @Mock
    private lateinit var pingService: PingService

    @Mock
    private lateinit var timeService: TimeService

    @InjectMocks
    private lateinit var pingController: PingController

    @BeforeEach
    fun setup() {
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun testPingController() {
        `when`(pingService.ping()).thenReturn("pong ")
        `when`(timeService.getTime()).thenReturn("12:00 PM")

        val response = pingController.ping()
        verify(timeService,times(1)).getTime()
        verify(pingService,times(1)).ping()
        assertThat(response).isEqualTo("pong 12:00 PM")
    }
}
