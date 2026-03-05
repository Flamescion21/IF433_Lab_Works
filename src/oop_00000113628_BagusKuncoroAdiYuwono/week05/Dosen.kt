package oop_00000113628_BagusKuncoroAdiYuwono.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama){
    override fun bekerja() {
        println("$nama sedang menyiapkan materi perkuliahan!")
    }

    fun mengajar(){
        println("$nama mengajar mahasiswa di kelas")
    }
}