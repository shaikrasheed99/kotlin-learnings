package com.learnings.whenexpressions

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TrafficLightsTest {
    @Test
    internal fun shouldStopTheVehicleWhenTrafficLightIsRed() {
        val trafficLights = TrafficLights("Red")

        val action = trafficLights.action()

        assertEquals("Stop", action)
    }

    @Test
    internal fun shouldStartTheVehicleWhenTrafficLightIsYellow() {
        val trafficLights = TrafficLights("Yellow")

        val action = trafficLights.action()

        assertEquals("Start engine", action)
    }
}