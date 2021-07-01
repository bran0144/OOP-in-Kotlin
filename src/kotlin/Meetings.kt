package com.target

class Meeting{
    internal val logger = Logger()

    fun addParticipant(name: String) {
        if verifyParticipant(name)
            println("Added: $name")
    }
    private fun verifyParticipant(name: String) : Boolean {
        println("try to verify")
        return true
    }
    protected fun verifyMeeting(){}
}