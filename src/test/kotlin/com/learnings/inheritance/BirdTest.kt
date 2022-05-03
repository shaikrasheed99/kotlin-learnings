package com.learnings.inheritance

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BirdTest {
    @Test
    internal fun shouldBirdBeAbleToAnimalWalkingBehavior() {
        val bird: Animal = Bird()

        val birdWalking = bird.walk()

        assertEquals("Bird is walking!", birdWalking)
    }

    @Test
    internal fun shouldBirdBeAbleToHaveOwnWalkingBehavior() {
        val bird = Bird()

        val birdWalking = bird.walk()

        assertEquals("Bird is walking!", birdWalking)
    }
}