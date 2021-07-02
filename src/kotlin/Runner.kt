package com.target

fun main() {
    val meeting = Meeting("Review")

    println("Creating: $meeting with name${meeting.meetingName}")

    val participant = Participant()
    val name = Name()
    name.name = "Katie"
//    name.name = ""
    participant.name = name
    participant.email = "katie@gmail.com"

    val canonicalEmail = participant.canonicalEmail

    meeting.addParticipant(participant)
//    meeting.meetingName = "Review"

    meeting.logger
}