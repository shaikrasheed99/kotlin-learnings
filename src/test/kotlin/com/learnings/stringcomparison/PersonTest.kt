package com.learnings.stringcomparison

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class PersonTest {
    @Test
    internal fun shouldBeAbleToCompareNamesOfTwoPersons() {
        val personOne = Person("ironman")
        val personTwo = Person("ironman")

        val result = personOne.isNameEqual(personTwo)

        assertTrue(result)
    }
}