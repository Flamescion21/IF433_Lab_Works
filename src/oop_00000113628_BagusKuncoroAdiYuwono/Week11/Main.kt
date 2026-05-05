package oop_00000113628_BagusKuncoroAdiYuwono.Week11

fun main() {
    println("=====TEST EXTENSION FUNCTIONS=====")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=====TEST RUN FUNCTIONS=====")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi run: $result")
}