package com.learnings.operators

import com.learnings.operators.exceptions.DivideByZeroException
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    internal fun init() {
        calculator = Calculator()
    }

    @Test
    internal fun shouldBeAbleToAddTwoNumbers() {
        val result = calculator.add(10, 20)

        assertEquals(30, result)
    }

    @Test
    internal fun shouldBeAbleToSubtractTwoNumbers() {
        val result = calculator.sub(20, 10)

        assertEquals(10, result)
    }

    @Test
    internal fun shouldBeAbleToMultiplyTwoNumbers() {
        val result = calculator.multiply(10, 20)

        assertEquals(200, result)
    }

    @Test
    internal fun shouldBeAbleToDivideOneNumberWithAnother() {
        val result = calculator.divide(10, 5)

        assertEquals(2, result)
    }

    @Test
    internal fun shouldNotBeAbleToDivideWhenDenominatorIsZero() {
        val calculator = Calculator()

        assertFailsWith<DivideByZeroException> { calculator.divide(10, 0) }
    }
}