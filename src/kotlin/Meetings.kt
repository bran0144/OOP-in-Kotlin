package com.target

class Meeting{
    internal val logger = Logger()
    var meetingName: String = ""

    fun addParticipant(participant: Participant) {
        if verifyParticipant(participant)
            println("Added: ${participant.participantName}")
    }
    private fun verifyParticipant(participant: Participant) : Boolean {
        println("try to verify")
        return true
    }
    protected fun verifyMeeting(){}
}
class Participant {
    var name: Name = Name
    var email = ""

    val participantName
        get() = name.name

    val canonicalEmail
        get() = email.toUpperCase()
}

class Name {
    var name: String = ""
        set(value: String) {
            if(value.isNullOrBlank()) throw IllegalArgumentException()
            field = value
        }
}