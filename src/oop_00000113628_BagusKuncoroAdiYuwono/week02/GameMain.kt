package oop_00000113628_BagusKuncoroAdiYuwono.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Nama Hero: ")
    val name = scanner.next()

    println("Base Dmg $name: ")
    val damage = scanner.nextInt()
    val hero = Hero(name, baseDamage = damage)
    var enemyHp = 100
    println("oh tidak, ada antique antique Asix")
    while (hero.isAlive() && enemyHp > 0){
        println("Aksi :")
        println("1 : Serang, 2 : Kabur")
        val action = scanner.nextInt()
        scanner.nextLine()

        if(action == 1){
            enemyHp -= hero.baseDamage

            if(enemyHp < 0){
                enemyHp = 0
            }

            println("Sisa HP musuh: $enemyHp")
            if(enemyHp > 0){
                val enemyDamage = (10..20).random()
                println("Musuh Menyerang")
                hero.takeDamage(enemyDamage)
                println("Sisa Hp ${hero.name}: ${hero.hp}")
            }
        } else if(action == 2){
            println("Berhasil Kabur")
            break
        } else {
            println("Nguwawur, pilih 1 atau 2 aja!")
        }
        println()
    }

    println("==Hasil Pertarungan==")

    if(hero.isAlive() && enemyHp == 0){
        println("${hero.name} Menang!!!")
    } else if(!hero.isAlive() && enemyHp > 0){
        println("${hero.name} Kalah :(")
    } else{
        println("${hero.name} melarikan diri (Hero macam apa ini -_-)")
    }

}