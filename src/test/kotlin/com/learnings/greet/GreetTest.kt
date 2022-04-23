package com.learnings.greet

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GreetTest {
    @Test
    internal fun shouldBeAbleToGreetAsHelloByName() {
        val greet = Greet()

        val greeting = greet.sayHello("ironman")

        assertEquals("Hello, ironman", greeting)
    }

    @Test
    internal fun shouldBeAbleToGreetAsHeyByName() {
        val greet = Greet()

        val greeting = greet.sayHey("batman")

        assertEquals("Hey, batman", greeting)
    }
}