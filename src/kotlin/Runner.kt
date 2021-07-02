package com.target

fun main() {
    val meeting = Meeting()

    println("Creating: $meeting")

    val participant = Participant()
    participant.name = "Katie"
    participant.email = "katie@gmail.com"
    meeting.addParticipant(participant)
//    meeting.meetingName = "Review"

    meeting.logger
}