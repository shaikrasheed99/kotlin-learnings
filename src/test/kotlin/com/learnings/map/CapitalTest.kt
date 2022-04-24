package com.learnings.map

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CapitalTest {
    private lateinit var capital: Capital

    @BeforeEach
    internal fun setUpCapital() {
        capital = Capital()
    }

    @Test
    internal fun shouldHaveDelhiAsCapitalOfIndia() {
        capital.map["India"] = "Delhi"

        assertEquals("Delhi", capital.map["India"])
    }

    @Test
    internal fun shouldHaveMoscowAsCapitalOfRussia() {
        capital.map["Russia"] = "Moscow"

        assertEquals("Moscow", capital.map["Russia"])
    }
}