package oop_00000113628_BagusKuncoroAdiYuwono.Week13

import java.io.File
fun main() {
    println("Test unsafe resource handling")
    val unsafeFile = File("unsafeLogs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")
    writer.close()
    println("Proses penulisan unsafe selesai")
}