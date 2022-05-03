package com.learnings.secondaryconstructor

import com.learnings.secondaryconstructor.exceptions.NegativeAmountException

class BankAccount(private var amount: Int) {
    constructor(interestAmount: Int, amount: Int) : this(amount) {
        if (amount < 0) throw NegativeAmountException()
        this.amount = amount - interestAmount
    }

    fun getBalance(): Int {
        return amount
    }
}
