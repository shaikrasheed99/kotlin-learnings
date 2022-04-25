package com.learnings.exceptions

class NaturalNumber {
    fun check(number: Int): Boolean {
        if (number < 1) {
            throw NumberIsNotNaturalException()
        }
        return true
    }
}
