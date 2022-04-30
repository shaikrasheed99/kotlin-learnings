package com.learnings.secondaryconstructor

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BankAccountTest {
    @Test
    internal fun shouldBeAbleToHaveSomeAmountInAccount() {
        val bankAccount = BankAccount(10)

        assertEquals(10, bankAccount.getBalance())
    }
}