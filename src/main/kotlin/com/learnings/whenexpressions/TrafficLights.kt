package com.learnings.whenexpressions

class TrafficLights(private val lightColor: String) {
    fun action(): String {
        return when (lightColor) {
            "Red" -> "Stop"
            "Yellow" -> "Start engine"
            else -> "nothing"
        }
    }
}
