package com.learnings.secondaryconstructor

import com.learnings.secondaryconstructor.exceptions.NegativeAmountException
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class BankAccountTest {
    @Test
    fun shouldBeAbleToHaveSomeAmountInAccount() {
        val bankAccount = BankAccount(10)

        assertEquals(10, bankAccount.getBalance())
    }

    @Test
    fun shouldNotBeAbleToHaveNegativeAmountInAccount() {
        assertFailsWith<NegativeAmountException> { BankAccount(10, -10) }
    }
}