package oop_00000113628_BagusKuncoroAdiYuwono.week03

class Weapon(name: String, damage: Int){
    val name: String = name
    var damage: Int = damage
        set(value){
            if(value < 0){
                println("Damage tidak bisa < 0")
            }else if(value  > 1000){
                println("Terlalu overpowered!")
                field = 1000
            }else{
                field = value
            }
        }

    init{
        this.damage = damage
    }

    val tier: String
        get(){
            if(damage > 800){
                return "Legendary"
            }else if(damage > 500){
                return "Epic"
            }else{
                return "Common"
            }
        }
}