package oop_00000113628_BagusKuncoroAdiYuwono.Test.Week07

sealed class Hasil {
    data class Sukses(val data: String) : Hasil()
    data class Error(val ex: Exception) : Hasil()
    object Loading : Hasil()

    fun handle_response(res: Hasil) {
        when(res) {
            is Sukses -> {println("Sukses lempar data")}
            is Error -> {println("Error ${res.ex}")}
            Loading -> {println("Loading...")}
        }
    }
}