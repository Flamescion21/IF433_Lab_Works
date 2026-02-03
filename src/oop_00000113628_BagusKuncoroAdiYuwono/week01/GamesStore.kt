package oop_00000113628_BagusKuncoroAdiYuwono.week01

fun main() {
    val gameTitle = "Gathering Wives"
    val price = 700000
}

fun calculateDiscount(price: Int) = if (price > 500000) price - (price * 20/100) else price - (price * 10/100)