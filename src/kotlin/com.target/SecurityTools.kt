package com.target

fun main(args: Array<String>) {
    val ishelp: String = if (args.isNotEmpty()) args[0] else "";

    if (args.size<2 || ishelp == "--help") {
        println("usage java SecurityTools")
        println("hashing: java SecurityToolKit")
        println("signing: java SecurityToolKit")
        println("providers: java SecurityToolKit")
        return
    }
    if (ishelp.startsWith("--help")) {
        val helpon: String = ishelp.split(":")[1]
        when (helpon) {
            //help on each part
        }
        return
    }
    ParseArgs.setupDefaultValues(
        arrayOf(ArgumentInitializers("operation", ArgumentType.StringType(), "-op"),
            (ArgumentInitializers("algorithm", ArgumentType.StringType(), "-a"),
            (ArgumentInitializers("keystoneType", ArgumentType.StringType(), "-JKS"),
            )
    )


    ParseArgs(args)
    val type: ArgumentType.StringType = ParseArgs.arguments.get("operation")!!.type as ArgumentType.StringType

    when (type.value.toLowerCase()) {
        "hash" -> {

        }
        "sign" -> {

        }
        "providers" -> {
            Providers().run()
        }
    }
}