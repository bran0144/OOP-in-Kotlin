package com.target

class Name(val name: String) {
    init {
        if(name.isBlank()) throw IllegalArgumentException()
    }

}