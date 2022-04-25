package com.learnings.exceptions

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class NaturalNumberTest {
    @Test
    internal fun shouldBeAbleToCheckGivenNumberIsNaturalNumber() {
        val naturalNumber = NaturalNumber()

        val result = naturalNumber.check(1)

        assertTrue(result)
    }
}