package com.target

interface Logger {
    fun debug(msg: String)
    fun warn(msg: String)
}

class FileLogger(val file: Path) : Logger {
    override fun debug(msg: String) {
        TODO("Not yet implemented")
    }

    override fun warn(msg: String) {
        TODO("Not yet implemented")
    }
}