package com.learnings.abstraction

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CircleTest {
    @Test
    fun shouldBeAbleToDrawCircle() {
        val circle = Circle()

        assertEquals("Circle is drawn!", circle.draw())
    }
}