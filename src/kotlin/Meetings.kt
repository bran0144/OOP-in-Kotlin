package com.target

open class Meeting{val meetingName: String, open val location: Location = Location
    internal val logger = Logger()

    open val locationName = ""



//    val meetingName: String

    fun addParticipant(participant: Participant) {
        if verifyParticipant(participant)
            println("Added: ${participant.participantName}")
    }
    private fun verifyParticipant(participant: Participant) : Boolean {
        println("try to verify")
        return true
    }
    protected open fun verifyMeeting(){
        println("Meeting: verify meeting")
    }
}

class Location(val address: String){

}

class PersonalReview(meetingName: String, val employee: Participant, reviewers: List<Participant>, override val location: Room)
    : Meeting(meetingName, location) {

    override val locationName: String
        get() = location.roomName

        fun closeReview() {
            println("Review ended")
            verifyMeeting()
        }
    override fun verifyMeeting() {
        println("Personal review: verify meeting")
        super.verifyMeeting()

    }
}