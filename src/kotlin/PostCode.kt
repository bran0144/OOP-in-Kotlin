package com.target

abstract class PostCode(val postCode: String) {
    abstract fun verify()
    init {
        verify()
    }
}

class USZipCode(zipCode: String) : PostCode(zipCode) {
    override fun verify() {
        val pattern: Pattern! = Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?s")
        val matcher: Matcher = pattern.matcher(postCode)
        if(!matcher.matches()) throw IllegalArgumentException()
    }

}

class UKPostCode(postCode: String) : (PostCode(postCode){
    override fun verify(){}
})