package oop_00000113628_BagusKuncoroAdiYuwono.Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0){
        "porsi kibble harus lebih dari 0gr"
    }
    if(isJammed){
        throw DispenserJamException()
    }
    if(requestedGram > availableGram){
        throw FoodEmptyException(requestedGram, requestedGram)
    }
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50
    try {
        dispenseKibble(
            80,
            currentKibbleStock, false
        )
    } catch (e: DispenserJamException) {
        println("Dispenser jam!")
    } catch (e: FoodEmptyException) {
        println("Food empty!")
    } catch (e: Exception) {
        println("General error!")
    } finally {
        println("Siklus pengecekan dispeser pagi selesai!")
    }
    runCatching {
        dispenseKibble( 30, 1000, false)
    } .onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! sisa stok kibble: $currentKibbleStock gr")
    }.onFailure {
            error -> println("Peringatan ke pemilik: ${error.message}")
    }
}

//tested