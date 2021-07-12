package com.target

open class Location {

}
class Room(roomName: String) : Location()

class UKAddress(val firstLine: String,
                val secondLine: String,
                val city: String,
                val country: String,
                val postCode: String)  : Location()