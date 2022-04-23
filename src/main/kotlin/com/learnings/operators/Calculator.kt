package com.learnings.operators

class Calculator(private val firstNumber: Int, private val secondNumber: Int) {

    fun add(): Int {
        return firstNumber + secondNumber
    }

    fun sub(): Int {
        return firstNumber - secondNumber
    }

    fun multiply(): Int {
        return firstNumber * secondNumber
    }
}
