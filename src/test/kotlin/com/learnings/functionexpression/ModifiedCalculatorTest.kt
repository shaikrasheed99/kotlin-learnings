package com.learnings.functionexpression

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ModifiedCalculatorTest {
    private lateinit var modifiedCalculator: ModifiedCalculator

    @BeforeEach
    internal fun setUpCalculator() {
        modifiedCalculator = ModifiedCalculator()
    }

    @Test
    internal fun shouldCalculateAdditionOfTwoNumbers() {
        val result = modifiedCalculator.add(10, 20)

        assertEquals(30, result)
    }

    @Test
    internal fun shouldCalculateSubtractionOfTwoNumbers() {
        val result = modifiedCalculator.subtract(20, 10)

        assertEquals(10, result)
    }

    @Test
    internal fun shouldCalculateMultiplicationOfTwoNumbers() {
        val result = modifiedCalculator.multiply(20, 10)

        assertEquals(200, result)
    }
}