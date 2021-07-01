package com.target

class Meeting{
    fun addParticipant(name: String) {
        if verifyParticipant(name)
            println("Added: $name")
    }
    private fun verifyParticipant(name: String) : Boolean {
        println("try to verify")
        return true
    }
}