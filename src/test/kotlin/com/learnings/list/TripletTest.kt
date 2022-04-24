package com.learnings.list

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TripletTest {

    private lateinit var triplet: Triplet

    @BeforeEach
    internal fun setUpTriplet() {
        triplet = Triplet()
        triplet.list = listOf(3, 4, 5)
    }

    @Test
    internal fun shouldHaveListOfThreeNumberInsideTriplet() {
        assertEquals(3, triplet.list.size)
    }
}