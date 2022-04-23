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

    @Test
    internal fun shouldBeAbleToSubtractTwoNumbers() {
        val calculator = Calculator(20, 10)

        val result = calculator.sub()

        assertEquals(10, result)
    }

    @Test
    internal fun shouldBeAbleToMultiplyTwoNumbers() {
        val calculator = Calculator(10, 20)

        val result = calculator.multiply()

        assertEquals(200, result)
    }

    @Test
    internal fun shouldBeAbleToDivideOneNumberWithAnother() {
        val calculator = Calculator(10, 5)

        val result = calculator.divide()

        assertEquals(2, result)
    }
}