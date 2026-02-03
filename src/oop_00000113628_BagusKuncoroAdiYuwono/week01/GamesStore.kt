package oop_00000113628_BagusKuncoroAdiYuwono.week01

fun main() {
    val gameTitle = "Gathering Wives"
    val price = 700000
    val finalPrice = calculateDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int) = if (price > 500000) price - (price * 20/100) else price - (price * 10/100)

fun printReceipt(title: String, finalPrice: Int) = println("Judul game : $title\nHarga game : $finalPrice")