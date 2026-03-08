package oop_00000113628_BagusKuncoroAdiYuwono.week05

fun main(){
    val dosenObject = Dosen("Bagus K", "2136")
    val adminObject = Admin("Joko")
    val eWalletObject = EWallet("Bagus", 50000.0)
    val creditCardObject = creditCard("BK", 100000.0)
    val PaymentMethods: List<PaymentMethod> = listOf(eWalletObject, creditCardObject)
    val daftarPegawai: List<Pegawai> = listOf(dosenObject, adminObject)
    val math = MathHelper()




    for(PaymentMethod in PaymentMethods) {
        PaymentMethod.processPayment(75000.0)
    }


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

    println(math.hitungLuas(3))
    println(math.hitungLuas(3, 4))
    println(math.hitungLuas(2.4))

}