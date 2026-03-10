package oop_00000113628_BagusKuncoroAdiYuwono.week06

class Smartphone: Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting")
    }
}