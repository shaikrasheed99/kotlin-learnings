package com.learnings.whenexpressions

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TrafficLightsTest {
    @Test
    internal fun shouldGetStopWhenTrafficLightIsRed() {
        val trafficLights = TrafficLights("Red")

        val action = trafficLights.action()

        assertEquals("Stop", action)
    }

    @Test
    internal fun shouldGetStartEngineAsMessageWhenTrafficLightIsYellow() {
        val trafficLights = TrafficLights("Yellow")

        val action = trafficLights.action()

        assertEquals("Start engine", action)
    }

    @Test
    internal fun shouldGetGoAsMessageWhenTrafficLightIsGreen() {
        val trafficLights = TrafficLights("Green")

        val action = trafficLights.action()

        assertEquals("Go", action)
    }
}