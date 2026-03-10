package oop_00000113628_BagusKuncoroAdiYuwono.Test.Week06

class KRS(override val nama: String, override val namaSiswa: String) :Mahasiswa, Siswa {
    override fun belajar() {
        println("Si $nama sedang belajar")
        println("Siswa $namaSiswa belajar juga")

    }


    override fun mandi() {
        println("Si $namaSiswa sedang mandi")
    }

    override fun makan() {
        println("Si $nama sedang makan")
    }

    override fun main_game() {
        super<Mahasiswa>.main_game()
    }
}