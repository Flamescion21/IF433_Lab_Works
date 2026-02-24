package oop_00000113628_BagusKuncoroAdiYuwono.week04

open class Car(brand: String, val numberofDoors: Int): Vehicle(brand) {

    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberofDoors pintu dibuka")
    }
    override fun honk(){
        println("TIN TIN! Mobil $brand lewat!")
    }
}