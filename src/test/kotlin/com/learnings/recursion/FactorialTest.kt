package com.learnings.recursion

import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FactorialTest {
    @Test
    internal fun shouldBeAbleToCalculateFactorialOfGivenNumber() {
        val factorial = Factorial()

        val result = factorial.get(5.toBigInteger())

        assertEquals(BigInteger("120"), result)
    }

    @Test
    internal fun shouldBeAbleToCalculateFactorialOfBigNumbers() {
        val factorial = Factorial()

        val result = factorial.get(10.toBigInteger())

        assertEquals(BigInteger("3628800"), result)
    }
}