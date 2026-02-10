package oop_00000113628_BagusKuncoroAdiYuwono.week02

class Student(var name: String,
              var nim: String,
              var major: String
){
    init {
        if(nim.length != 5){
            println("Warning: Onjek tercipta dengan NIM ($nim) yang tidak valid")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else{
            println("LOG: Objek student $name berhasil dialokasikan di memory")


        }
    }
}