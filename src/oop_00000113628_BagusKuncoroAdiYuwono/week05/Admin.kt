package oop_00000113628_BagusKuncoroAdiYuwono.week05

class Admin(nama: String) : Pegawai(nama){
    override fun bekerja() {
        println("$nama sedang duduk di depan komputer ngurusin administarasi")
    }

    fun doAdminWork(){
        println("$nama sedang merekap data absensi mahasiswa!")
    }
}