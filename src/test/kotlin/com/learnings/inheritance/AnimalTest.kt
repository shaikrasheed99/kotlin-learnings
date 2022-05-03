package com.learnings.inheritance

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AnimalTest {
    @Test
    internal fun shouldAnimalBeAbleToWalk() {
        val animal = Animal()

        assertEquals("Animal is walking!", animal.walk())
    }
}