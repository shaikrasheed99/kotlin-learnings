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

    @Test
    internal fun shouldGetIndexNumbersOfEveryNumberInsideTriplet() {
        assertEquals(1, triplet.list.indexOf(4))
    }

    @Test
    internal fun shouldGetNumbersFromTripletWhenIndexIsGiven() {
        assertEquals(5, triplet.list[2])
    }
}