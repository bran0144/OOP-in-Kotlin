package com.target

class Meeting{
    internal val logger = Logger()
    var meetingName: String = ""

    fun addParticipant(participant: Participant) {
        if verifyParticipant(participant)
            println("Added: ${participant.name}")
    }
    private fun verifyParticipant(participant: Participant) : Boolean {
        println("try to verify")
        return true
    }
    protected fun verifyMeeting(){}
}
class Participant {
    var name = ""
    var email = ""

}