package com.learnings.`interface`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ElasticBallTest {
    @Test
    fun shouldBeAbleToElastify() {
        val elasticBall = ElasticBall()

        assertEquals("elastify!", elasticBall.elastify())
    }
}