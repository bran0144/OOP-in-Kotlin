package com.target

fun main() {
    val meeting = Meeting("Review", Location("any address"))
    val review = PersonalReview("Review Meeting", Participatn(Name("Alice"), ""), listof(), Location("Room 1"))

    println("Creating $review with name ${review.meetingName} at ${review.location}")

    val name = Name("Katie")

    val participant = Participant(name, "katie@gmail.com")
//    name.name = ""

//    val canonicalEmail = participant.canonicalEmail

    meeting.addParticipant(participant)
//    meeting.meetingName = "Review"

//    meeting.logger
}