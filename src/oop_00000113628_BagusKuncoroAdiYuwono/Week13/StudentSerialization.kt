package oop_00000113628_BagusKuncoroAdiYuwono.Week13
import java.io.File
import java.io.FileNotFoundException

data class Student(
    val name: String,
    val age: Int,
    val gpa: Double
)

// Serialization (Object to CSV)
fun Student.toCSV(): String = "$name,$age,$gpa"

// Deseletialization (CSV to Object)
fun fromCSV(line: String) : Student{
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}

fun saveStudent(student: List<Student>, path: String) {
    File(path).writeText(
        student.joinToString("\n") {
            it.toCSV()
        })
}

fun loadStudents(path: String) : List<Student>{
    return try {
        File(path).readLines().map { fromCSV(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val students = listOf(
        Student("Alice", 20, 3.8),
        Student("Bob", 22, 3.5)
    )
    saveStudent(students, "students.csv")

    val loaded = loadStudents("students.csv")
    println("Loaded student data")
    loaded.forEach { println(it) }
}