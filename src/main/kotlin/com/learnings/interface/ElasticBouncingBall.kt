package com.learnings.`interface`

class ElasticBouncingBall : Elastify, Bouncing {
    override fun elastify(): String {
        return "elastify!"
    }

    override fun bounce(): String {
        return "bouncing!"
    }

    fun elastifyAndBounce(): String {
        return elastify() + " " + bounce()
    }
}
