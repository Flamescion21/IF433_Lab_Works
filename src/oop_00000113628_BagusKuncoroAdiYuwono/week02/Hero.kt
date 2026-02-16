package oop_00000113628_BagusKuncoroAdiYuwono.week02

class Hero(
    val name: String,
    var hp: Int = 100,
    val baseDamage: Int
){
    fun attack(targetName: String){
        println("$name Serang $targetName")
    }

    fun takeDamage(damage: Int){
        hp -= damage
        if(hp < 0){
            hp = 0
        }

        println("$name terkena $damage damage.")
    }


    fun isAlive(): Boolean{
        return hp > 0
    }
}