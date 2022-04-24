package com.learnings.loops

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NumbersTest {
    @Test
    internal fun shouldCalculateSumOfNaturalNumbersFromRange() {
        val numbers = Numbers(1, 10)

        val naturalSum = numbers.naturalSum()

        assertEquals(55, naturalSum)
    }

    @Test
    internal fun shouldCalculateSumOfEvenNumbersFromRange() {
        val numbers = Numbers(1, 10)

        val evenSum = numbers.evenSum()

        assertEquals(30, evenSum)
    }

    @Test
    internal fun shouldCalculateSumOfOddNumbersFromRange() {
        val numbers = Numbers(1, 10)

        val oddSum = numbers.oddSum()

        assertEquals(25, oddSum)
    }
}