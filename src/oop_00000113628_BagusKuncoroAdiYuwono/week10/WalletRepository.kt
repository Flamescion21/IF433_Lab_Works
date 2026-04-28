package oop_00000113628_BagusKuncoroAdiYuwono.week10

    interface Named {
        val name: String
    }

class WalletRepository<T: Named>{
    private val items =  mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }
    fun getAll(): List<T>{
        return items
    }

    fun findByName(query: String): List<T> {
        return items.filter { it.name.contains(query, ignoreCase = true) }
    }
}