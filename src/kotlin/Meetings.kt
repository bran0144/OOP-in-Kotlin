package com.target

class Meeting{val meetingName: String, val location: Location = Location "")
    internal val logger = Logger()



//    val meetingName: String

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

class Location(val address: String){

}