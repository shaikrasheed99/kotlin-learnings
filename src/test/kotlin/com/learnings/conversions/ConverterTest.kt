package com.learnings.conversions

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ConverterTest {
    @Test
    internal fun shouldBeAbleToConvertStringNumberToIntNumber() {
        val converter = Converter()

        converter.number = "10"
        val number = converter.number.toInt()

        assertEquals(10, number)
    }
}