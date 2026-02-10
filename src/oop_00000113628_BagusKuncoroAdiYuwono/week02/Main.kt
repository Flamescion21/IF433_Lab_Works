package oop_00000113628_BagusKuncoroAdiYuwono.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukan Nama: ")
    val name = scanner.nextLine()

    print("Masukan NIM  (Wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine()


    if (nim.length !=5) {
        println("ERROR: Pendaftaran di batalkan. NIM haris 5 karakter!")

    } else {

        print("Pilih Jalur (1. reguler, 2. Umum: ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            print("Masuan Jurusan: ")
            val major = scanner.nextLine()

            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2) {
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {
            println("Pilihan ngawur, pendaftaran batal")
        }
    }
}