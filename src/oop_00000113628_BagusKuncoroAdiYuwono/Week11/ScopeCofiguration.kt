package oop_00000113628_BagusKuncoroAdiYuwono.Week11

data class User (var name: String = "", var age: Int = 0)

fun main(){
    println("=====TEST APPLY=====")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)

    println("=====TEST ALSO=====")
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("log sebelum ditambah: $it")
    }.add(4)
    println("setelah ditambah: $numbers")

    println("=====TEST WITH=====")
    with(user) {
        println("User detail -> Nama: $name, Umur: $age")
    }
}