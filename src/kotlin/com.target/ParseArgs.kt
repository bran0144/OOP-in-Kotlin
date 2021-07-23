package com.target

object ParseArgs{
    private val argumentKeys = mutableMapOf<String, String>()
    val arguments = mutableMapOf<String, ArgumentInitializers>()

    private val strArguments = mutableMapOf<String, Any>()

    fun setupDefaultValues(argumentSetup: Array<ArgumentInitializers>) {
        initializeKeyNameMaps(argumentSetup)
        initializeDefaultArgumentValues(argumentSetup)
    }
    operator fun get(argumentName: String): Any? {
        val argument = arguments[argumentName.toLowerCase()]n?: throw IllegalArgumentException(argumentName)

        return when (argument.type) {
            is ArgumentType.StringType -> {
                argument.type.value
            }
            is ArgumentType.BooleanType -> {
                argument.type.value
            }
        }
    }
    operator fun invoke(args: Array<String>) {
        var ndx = 0
        while (ndx < args.size) {
            val argKey = getTheArgumentKeys(args, ndx)
            val argName = getTheArgumentNameFromTheKey(argKey)

            if (arguments[argName.toLowerCase()] == null) throw IllegalArgumentException()

            val argument: ArgumentInitializers = arguments[argName.toLowerCase()]!!

            argumentSetup.forEach{
                argumentKeys[it.key.toLowerCase()] = it.name.toLowerCase()
                arguments[it.name.toLowerCase()] = it
            }
        }
    }
    sealed class ArgumentType {
        class StringType(var value: String = "") : ArgumentType()
        class BolleanType(var value: Boolean = false) : ArgumentType()
    }
    data class ArgumentInitializers(val name: String,
                            val type: ArgumentType,
                            val key: String)
    object Argument {
        fun <T> argument():
                ReadOnlyProperty<Any, T> = object : ReadOnlyProperty<Any, T> {
                    @Suppress("UNCHECKED_CAST")
                    override fun getValue(thisRef: Any, property: KProperty<*>) : T {
                        return ParseArgs[property.name] as T
                    }
                }
    }
}