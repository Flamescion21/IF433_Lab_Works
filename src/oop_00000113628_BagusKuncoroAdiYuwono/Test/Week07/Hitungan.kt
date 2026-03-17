package oop_00000113628_BagusKuncoroAdiYuwono.Test.Week07

class Hitungan private constructor(val tipe:String) {
    init {
        println("isi param class: ${tipe}")
    }

    companion object {
        const val namaMTK: String = "Matematika"
        fun tambah(a: Int, b: Int) {
            println("hasil penambahan: " + (a+b))
        }
        fun kali(a: Int, b: Int) {
            println("hasil perkalian: " + (a*b))
        }
        fun buat_data(tipeUser: String){
            Hitungan(tipeUser)
        }
    }
}