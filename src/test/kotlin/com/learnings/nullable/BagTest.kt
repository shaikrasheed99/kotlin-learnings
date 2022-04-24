package com.learnings.nullable

import org.junit.jupiter.api.Test
import kotlin.test.assertNull

class BagTest {
    @Test
    internal fun shouldBagContainsNullItems() {
        val bag = Bag()

        assertNull(bag.items)
    }
}