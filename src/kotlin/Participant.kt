package com.target

class Participant {
    var name: Name = Name
    var email = ""

    val participantName
        get() = name.name

    val canonicalEmail
        get() = email.toUpperCase()
}