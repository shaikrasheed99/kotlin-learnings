package com.learnings.`interface`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ElasticBouncingBallTest {
    @Test
    fun shouldBeAbleToBounceAndElastify() {
        val elasticBouncingBall = ElasticBouncingBall()

        assertEquals("elastify! bouncing!", elasticBouncingBall.elastifyAndBounce())
    }
}