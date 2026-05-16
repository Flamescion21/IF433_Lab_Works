package oop_00000113628_BagusKuncoroAdiYuwono.Test.Week12

fun pembagian(){
    try {
        val a = 10
        val b = 0
        val hasil = a/b
        println("Hasil bagi $hasil")
    } catch (e: Exception) {
        println("Ada error" + e.message)
    } finally {
        println("Selesai Try catch")
    }
}

fun cek_tipe_variable(){
    var angka:Int = try {
        Integer.parseInt( "123")

    } catch (e: Exception){
        println("ada error ${e.message}")
        777
    }
    println(angka)
}


fun cek_nilai(nilai:Int){
    if (nilai <0){
        throw IllegalArgumentException("Minus loh rek")
    } else {
        println("nilai mu " + nilai)
    }
}

class cek_saldo_rekening(val pengeluaran:Int, val saldo: Int):
        Exception("saldo kamu sisa $saldo, nggak cukup buat belanja $pengeluaran")

class transaksi_keuangan(val totalBelanja: Int) {
    fun narik_uang(balance: Int){
        if (totalBelanja > balance){
            throw cek_saldo_rekening(totalBelanja, balance)
        } else {
            println("transaksi belanja berhasil, sisa saldo ${balance - totalBelanja}")
        }
    }
}

fun multiple_catch(input:String){
    try {
        val angka:Int = input.toInt()
        val hitungBagi:Int = angka/0
        println("Hasil bagi $hitungBagi")
    } catch (e: NumberFormatException) {
        println("nggak bisa bagi huruf ${e.message}")

    } catch (e:ArithmeticException){
        println("Masa Pembagian pake 0 : ${e.message}")
    } catch (e:Exception){
        println("ada error di multiple catch ${e.message}")
    }
}

sealed class BANKException(pesan:String): Exception("Error di Bank Exception $pesan") {}

class cek_saldo(val pengeluaran: Int): BANKException("Belanja $pengeluaran lebih besar dari saldo")
class cek_input(val transaksi: Int): BANKException("transaksi kok minus  $transaksi")

fun transaksi_belanja(saldoKamu:Int, jajanKamu: Int): Int{

    if (jajanKamu < 0){
        throw cek_input(jajanKamu)
    } else if (saldoKamu < jajanKamu){
        throw cek_saldo(jajanKamu)
    }
    return saldoKamu - jajanKamu
}


fun main() {
    pembagian()
    cek_tipe_variable()
    try {
        cek_nilai(75)
    } catch (e: Exception) {
        println("ada error kat sini " + e.message)
    }
    val trx = transaksi_keuangan(1000)
    trx.narik_uang(balance = 1200)
    multiple_catch("abc")

    runCatching { transaksi_belanja(1000, 1200) }
        .onSuccess { println("Belanja berhasil, sisa saldo $it") }
        .onFailure { println(it) }
}
