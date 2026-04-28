package oop_00000113628_BagusKuncoroAdiYuwono.week10

class WalletRepository<T>(){
    private val items =  mutableListOf<T>()

    interface Named {
        val name: String
    }

    fun add(item: T){
        items.add(item)
    }
    fun getAll(): List<T>{
        return items
    }

    fun <T : Named> List<T>.findByName(query: String): List<T> {
        return this.filter { it.name.contains(query, ignoreCase = true) }
    }
}