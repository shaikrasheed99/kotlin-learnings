package com.learnings.secondaryconstructor

class BankAccount(private val amount: Int) {
    fun getBalance(): Int {
        return amount
    }
}
