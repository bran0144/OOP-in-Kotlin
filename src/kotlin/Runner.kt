package com.target

fun main() {
    val meeting = Meeting("Review", UKAddress("a house", "a street", "a town", "a county", "a postcode"))
    val review = PersonalReview("Review Meeting", Participatn(Name("Alice"), ""), listof(), Room("Room 1"))

    println("Creating $review with name ${review.meetingName} at ${review.locationName}")

    review.closeReview()

    val name = Name("Katie")

    val participant = Participant(name, "katie@gmail.com")
//    name.name = ""

//    val canonicalEmail = participant.canonicalEmail

    meeting.addParticipant(participant)
//    meeting.meetingName = "Review"

//    meeting.logger
}