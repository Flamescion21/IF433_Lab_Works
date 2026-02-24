package oop_00000113628_BagusKuncoroAdiYuwono.week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int): Car(brand, numberOfDoors){
    final override fun accelerate(){
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%")
    }
}