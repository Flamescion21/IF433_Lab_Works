package oop_00000113628_BagusKuncoroAdiYuwono.week03

class Player(username: String, xp: Int){
    val username: String = username
    private var xp: Int = xp

    val level: Int
        get(){
            return (xp / 100) + 1
        }

    fun addXp(amount: Int){
        if(amount < 0){
            println("Cuma menerima angka positif")
            return
        }
        val oldLevel = level
        this.xp += amount

        if(oldLevel < level){
            println("Level up!! Selamat $username berhasil naik ke level $level Hore!!")
        }
    }
}