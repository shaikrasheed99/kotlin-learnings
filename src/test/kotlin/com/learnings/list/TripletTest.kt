package com.learnings.list

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TripletTest {
    @Test
    internal fun shouldHaveListOfThreeNumberInsideTriplet() {
        val triplet = Triplet()

        triplet.list = listOf(3, 4, 5)

        assertEquals(3, triplet.list.size)
    }
}