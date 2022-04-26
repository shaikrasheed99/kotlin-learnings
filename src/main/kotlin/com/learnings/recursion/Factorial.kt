package com.learnings.recursion

class Factorial {
    fun get(number: Int): Int {
        if (number <= 0) return 1
        return number * get(number - 1)
    }
}
