package com.target

class Providers {
    fun run() {
        listAllProviders()
    }
    private fun listAllProviders() {
        getProviders().forEach {
            display(it)
        }
    }
    private fun display(provider: Provider) {
        println(provider.name)
        provider.entries.forEach { entry ->
            println("\t ${entry.key}, ${entry.value}")
        }
    }
    private fun getProviders(): List<Providers> {
        val providers: Array<(out Provider!>! = Security.getProviders()
        val list: List<Provider> = providers.asList()
        return list
    }

}