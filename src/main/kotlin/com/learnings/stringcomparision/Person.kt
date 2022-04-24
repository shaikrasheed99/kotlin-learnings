package com.learnings.stringcomparision

class Person(private val name: String) {
    fun isNameEqual(other: Person): Boolean {
        return name == other.name
    }
}
