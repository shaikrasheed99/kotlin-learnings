package com.learnings.operators

import com.learnings.operators.exceptions.DivideByZeroException

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

    fun divide(): Int {
        if (secondNumber == 0) throw DivideByZeroException()
        return firstNumber / secondNumber
    }
}
