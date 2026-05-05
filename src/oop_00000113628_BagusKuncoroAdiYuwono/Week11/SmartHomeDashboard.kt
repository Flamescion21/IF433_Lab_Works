package oop_00000113628_BagusKuncoroAdiYuwono.Week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    val device = SmartDevice().apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }
}