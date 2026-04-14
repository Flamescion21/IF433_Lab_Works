package oop_00000113628_BagusKuncoroAdiYuwono.Test.Week08

class profile_page(val idprofile:String?, val statusonline:String?){
    fun ganti_foto(filePhoto:String?){
        println("foto kamu = ${filePhoto}")
    }
}



fun main() {
    var nama: String? = "Wirawan";
    nama = null
    println(" nama kamu $nama")

    var profile = profile_page("12345",null)
    println("id = ${profile.idprofile} status = ${profile.statusonline}")

    profile.ganti_foto(null)


}