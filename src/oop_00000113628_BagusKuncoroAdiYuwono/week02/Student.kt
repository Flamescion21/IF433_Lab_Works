package oop_00000113628_BagusKuncoroAdiYuwono.week02


class Student(var name: String,
              var nim: String,
              var major: String,
              var gpa: Double = 0.0

){
    init {
        if(nim.length != 5){
            println("Warning: Objek tercipta dengan NIM ($nim) yang tidak valid")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else{
            println("LOG: Objek student $name berhasil dialokasikan di memory")
        }
    }

    constructor(name: String, nim: String) : this(name, nim, "Non-Matricilated"){
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}