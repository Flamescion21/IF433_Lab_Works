package oop_00000113628_BagusKuncoroAdiYuwono.Week09

data class Student(val name: String, val gpa: Double)

fun main(){
    val students = listOf(
        Student("andi", 3.2),
        Student("budi", 3.9),
        Student("citra", 2.8),
        Student("dewi", 3.7),
    )

    println("=== HONOR STUDENTS PIPELINE ===")

    val honorNames = students
        .filter{it.gpa > 3.5}
        .sortedBy{it.name}
        .map{it.name.uppercase()}

    honorNames.forEach{println("Honor roll: $it")}
}