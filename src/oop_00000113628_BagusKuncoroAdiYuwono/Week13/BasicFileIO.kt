package oop_00000113628_BagusKuncoroAdiYuwono.Week13

fun main() {
    println("\nTest write text")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis")

    file.appendText("Line 2: Menambahkan konfigurasi baru.\n")
    println("Text berhasil di-append")
}