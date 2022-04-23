package com.learnings.operators

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test
    internal fun shouldBeAbleToAddTwoNumbers() {
        val calculator = Calculator(10, 20)

        val result = calculator.add()

        assertEquals(30, result)
    }
}