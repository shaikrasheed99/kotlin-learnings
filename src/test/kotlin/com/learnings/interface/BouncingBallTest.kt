package com.learnings.`interface`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BouncingBallTest {
    @Test
    fun shouldBeAbleToBounce() {
        val bouncingBall = BouncingBall()

        assertEquals("bouncing!", bouncingBall.bounce())
    }
}