package com.learnings.primaryconstructor

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MobileTest {
    @Test
    internal fun shouldBeAbleToHaveNameForAMobile() {
        val mobile = Mobile("Redmi")

        assertEquals("Redmi", mobile.getName())
    }
}