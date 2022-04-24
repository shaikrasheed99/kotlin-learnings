package com.learnings.ifelse

class Voter(private val age: Int) {
    fun isEligible(): Boolean {
        if (age >= 18) {
            return true
        }
        return false
    }
}
