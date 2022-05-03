package com.learnings.inheritance

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BirdTest {
    @Test
    internal fun shouldBirdBeAbleToAnimalWalkingBehavior() {
        val bird = Bird()

        val birdWalking = bird.walk()

        assertEquals("Animal is walking!", birdWalking)
    }
}