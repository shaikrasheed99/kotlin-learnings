package com.learnings.loops

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NumberTest {
    @Test
    internal fun shouldCalculateSumOfNaturalNumbersFromRange() {
        val number = Number(1, 10)

        val naturalSum = number.naturalSum()

        assertEquals(55, naturalSum)
    }

    @Test
    internal fun shouldCalculateSumOfEvenNumbersFromRange() {
        val number = Number(1, 10)

        val evenSum = number.evenSum()

        assertEquals(30, evenSum)
    }

    @Test
    internal fun shouldCalculateSumOfOddNumbersFromRange() {
        val number = Number(1, 10)

        val oddSum = number.oddSum()

        assertEquals(25, oddSum)
    }
}