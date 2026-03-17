package oop_00000113628_BagusKuncoroAdiYuwono.Test.Week07

import oop_00000113628_BagusKuncoroAdiYuwono.Test.Week07.Koneksi.coba_konek_db

fun main(){
    Koneksi.kon ="LocalHost:131313"
    println("Link ${Koneksi.kon}")
    Koneksi.coba_konek_db()

    Hitungan.tambah(10, 20)
    Hitungan.kali(5, 20)
    println("Nama Matkul: ${Hitungan.namaMTK}")


    Hitungan.buat_data(tipeUser = "User Biasa")

    val dt = SaveData("Mario", 10, 100, 5)
    println("Nama char ${dt.namaChar}")
    println(dt)


    val dtCopy = dt.copy(namaChar = "Luigi")
    println("Nama char ${dtCopy.namaChar}")
    println(dtCopy)



    println("===CLASS ENUM===")
    val arah = Arah.Atas
    println(arah.tampilkan_isi_param())

    println("===SEALED CLASS===")
    val hsl: Hasil = Hasil.Sukses("Berhasil simpan")
    hsl.handle_response(hsl)
}