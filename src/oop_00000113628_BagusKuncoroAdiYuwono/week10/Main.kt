package oop_00000113628_BagusKuncoroAdiYuwono.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")


    println("\n=== TEST MULTIPLE PARAMATERS ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Aset: ${itemPrice.key}, Harga: ${itemPrice.value}USD")


    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Hasil proses: $result")
}