package com.learnings.ifelse

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class VoterTest {
    @Test
    internal fun shouldBeEligibleToCastVoteWhenAgeIsGreaterThanEighteen() {
        val voter = Voter(18)

        val eligible = voter.isEligible()

        assertTrue(eligible)
    }
}