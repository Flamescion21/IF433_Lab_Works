package oop_00000113628_BagusKuncoroAdiYuwono.Test

class Knd_motor:Kendaraan() {
    private var jmlBan:Int = 0
    init {
        jmlBan = 2
        println("motor saya $jmlBan ban")
        super.jalan_maju()
    }
    override fun jalan_maju(){
        println("Motor maju")
    }
}