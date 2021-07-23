package com.target

class Providers {
    private val filter: String by argument()

    fun run() {
        listAllProviders()
    }
    private fun listAllProviders() {
        if(filter.isEmpty()) {
        getProviders().forEach {
            display(it)
        } else {
            getFilterProviders().forEach {println("${it.providerName}: ${it.name}")}
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
    private fun getFilteredProviders(): List<ProviderDeatils> {
        return Security.getProviders().flatMap { provider ->
            provider.entries
                .filter{ it-> it.key.toString().contains(filter, true)}
                .map{ProviderDetails(provider.name, it.key.toString())}
    }

}