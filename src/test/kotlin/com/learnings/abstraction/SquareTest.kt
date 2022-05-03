package com.learnings.abstraction

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SquareTest {
    @Test
    fun shouldBeAbleToDrawSquare() {
        val square = Square()

        assertEquals("Square is drawn!", square.draw())
    }
}