package oop_00000113628_BagusKuncoroAdiYuwono.week04

fun main(){
    println("--- Testing Vehicle---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyoya", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()


    println("\n--- Testing Electric Car ---")
    val ElectricCar = ElectricCar("Tesla", 4, 100)
    ElectricCar.accelerate()
    ElectricCar.honk()
    ElectricCar.openTrunk()

    println("\n--- Developer ---")
    val developer = Developer("Bagus", 100000, "Kotlin")
    developer.work()
    val totalGajiDeveloper = developer.calculateBonus()
    println("total gaji : $totalGajiDeveloper")
}