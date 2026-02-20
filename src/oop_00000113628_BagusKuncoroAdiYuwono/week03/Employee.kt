package oop_00000113628_BagusKuncoroAdiYuwono.week03



    class Employee(val name: String) {
        var salary: Int = 0
            set(value) {
                if (value < 0) {
                    println("ERROR: Gaji tidak boleh negatif! diset ke 0")
                    field = 0
                } else {
                    field = value
                }
            }

        private var performanceRating: Int = 3

        fun increasePerformance(){
            performanceRating++
            println("Kinerja $name meningkat! Rating: $performanceRating")
        }

        fun printStatus(){
            println("Kinerja $name meningkat, Rating: $performanceRating")
        }
    }