package com.learnings.recursion

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FactorialTest {
    @Test
    internal fun shouldBeAbleToCalculateFactorialOfGivenNumber() {
        val factorial = Factorial()

        val result = factorial.get(5)

        assertEquals(120, result)
    }
}