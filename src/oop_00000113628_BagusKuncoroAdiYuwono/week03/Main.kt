package oop_00000113628_BagusKuncoroAdiYuwono.week03

/*fun main(){
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("gajiL ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}*/

/*fun main(){
    val weapon = Weapon("Weapon1", 100)

    println(weapon.damage)
    println(weapon.tier)
}*/

fun main(){
    val player = Player("Yogi", 0)
    println("Nama: ${player.username}")
    println("level: ${player.level}")

    player.addXp(50)
    println("level baru: ${player.level}")

    player.addXp(60)
    println("level baru: ${player.level}")
}