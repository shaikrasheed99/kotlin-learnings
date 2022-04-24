package com.learnings.loops

class Numbers(private var start: Int, private val end: Int) {
    private var range: IntRange = this.start..this.end

    fun naturalSum(): Int {
        var totalSum = 0
        for (numbers in range) {
            totalSum += numbers
        }
        return totalSum
    }

    fun evenSum(): Int {
        this.start = 2
        var totalSum = 0
        for (numbers in start..end step 2) {
            totalSum += numbers
        }
        return totalSum
    }
}
