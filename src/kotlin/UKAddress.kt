package com.target

abstract class PostalAddress(val firstLine: String,
                             val secondLine: String,
                             val city: String,
                             val county: String,
                             val postCode: PostalCode) : Location()

class UKAddress(firstLine: String,
                secondLine: String,
                city: String,
                county: String,
                postCode: UkPostCode)  : PostalAddress(firstLine, secondLine, city, county, postCode)

class USAddress(firstLine: String,
                secondLine: String,
                city: String,
                state: String,
                zipCode: USZipCode)  : PostalAddress(firstLine, secondLine, city, county, postCode)