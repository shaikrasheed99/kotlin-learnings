package com.learnings.exceptions

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertTrue

class NaturalNumberTest {
    @Test
    internal fun shouldBeAbleToCheckGivenNumberIsNaturalNumber() {
        val naturalNumber = NaturalNumber()

        val result = naturalNumber.check(1)

        assertTrue(result)
    }

    @Test
    internal fun shouldSayNumberIsNotNatural() {
        val naturalNumber = NaturalNumber()

        assertThrows<NumberIsNotNaturalException> { naturalNumber.check(-1) }
    }
}