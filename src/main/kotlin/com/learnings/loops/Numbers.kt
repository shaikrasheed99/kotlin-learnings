package com.learnings.loops

class Numbers(private val start: Int, private val end: Int) {
    private var range: IntRange = this.start..this.end

    fun naturalSum(): Int {
        var totalSum = 0
        for (numbers in range) {
            totalSum += numbers
        }
        return totalSum
    }
}
