package oop_00000113628_BagusKuncoroAdiYuwono.Test.Week07

enum class Arah (val petunjuk: String){
    Atas("naik"),
    Bawah("Turun"),
    Kiri("Belok"),
    Kanan("Mengsong");

    fun tampilkan_isi_param(){
        println("arah ke $petunjuk")
    }
}