package com.learnings.recursion

import java.math.BigInteger

class Factorial {
    fun get(number: BigInteger): BigInteger {
        if (number <= BigInteger("0")) return BigInteger("1")
        return number * get(number - BigInteger("1"))
    }
}
