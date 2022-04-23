package com.learnings.operators

import com.learnings.operators.exceptions.DivideByZeroException

class Calculator {

    fun add(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber + secondNumber
    }

    fun sub(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber - secondNumber
    }

    fun multiply(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber * secondNumber
    }

    fun divide(firstNumber: Int, secondNumber: Int): Int {
        if (secondNumber == 0) throw DivideByZeroException()
        return firstNumber / secondNumber
    }
}
