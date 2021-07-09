package com.target

fun main() {
    val meeting = Meeting("Review", Location("any address"))

    println("Creating: $meeting with name${meeting.meetingName} and at ${meeeting.location}")


    val name = Name()
    name.name = "Katie"
    val participant = Participant(name, "katie@gmail.com")
//    name.name = ""

//    val canonicalEmail = participant.canonicalEmail

    meeting.addParticipant(participant)
//    meeting.meetingName = "Review"

//    meeting.logger
}