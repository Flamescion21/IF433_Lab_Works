package oop_00000113628_BagusKuncoroAdiYuwono.week10

    interface Named {
        val name: String
    }

class WalletRepository<T>{
    private val items =  mutableListOf<T>()
    fun add(item: T){
        items.add(item)
    }
    fun getAll(): List<T>{
        return items
    }

    fun findBy(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }

}

