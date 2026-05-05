package oop_00000113628_BagusKuncoroAdiYuwono.Week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    val device = SmartDevice("Ezviz outdoor", "Camera").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }
}