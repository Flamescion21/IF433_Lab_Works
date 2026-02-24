package oop_00000113628_BagusKuncoroAdiYuwono.week04

class Developer(name: String, baseSalary: Int, val programmingLanguanges: String): Employee(name, baseSalary){
    override fun work(){
        println("$name sedang ngoding menggunakan $programmingLanguanges")
    }
}