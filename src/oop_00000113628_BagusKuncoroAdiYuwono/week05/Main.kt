package oop_00000113628_BagusKuncoroAdiYuwono.week05

fun main(){
    val dosenObject = Dosen("YogiDosen", "02932")
    val adminObject = Admin("YogiAdmin")

    val daftarPegawai: List<Pegawai> = listOf(dosenObject, adminObject)

    for(pegawai in daftarPegawai){
        pegawai.bekerja()

        when (pegawai){
            is Dosen -> {
                println("Terdeteksi dosen ${pegawai.nidn}")
                pegawai.bekerja()
            }
            is Admin -> {
                println("Terdeteksi admin ${pegawai.nama}")
                pegawai.doAdminWork()
            }
        }
    }
}