package oop_00000113628_BagusKuncoroAdiYuwono.Test.week10

class nonGeneric(var hasil:Any)

class generic<T>(var hasil:T)

class kota<T, V>(var kodepos:T, var telp:V)

fun <T> fungsi(angka:T):T{

    return angka
}

fun <T: Number> tambah(angka:T): Double{
    return angka.toDouble() + 50
}
fun <T: Number> kurang(angka:T): Int{
    return angka.toInt() - 50
}

class kalkulator<T:Number>(val a:T, val b:T){
    fun kali(): Double {
        return a.toDouble() * b.toDouble()
    }
    fun bagi(): Int{
        return a.toInt() / b.toInt()
    }
}


fun<T> nilaiKKM(list: List<T>, kkm:T):List<T> where T: Comparable<T> {
    return list.filter { it > kkm }
}

fun main(){
    println("=== Generic Where===")
    val nilaiMhs= listOf(80, 90, 67, 75, 97)
    val nilaiFilterKKM = nilaiKKM(nilaiMhs, 70)
    println(nilaiMhs)
    println(nilaiFilterKKM)


    println("===Kalkulator===")
    val kalk = kalkulator(10.2, 3.5)
    println("Hasil Kali: " + kalk.kali())
    println("Hasil bagi: " + kalk.bagi())


    println("===Generic===")
    val Gen = generic(200)
    println(Gen.hasil + 10)

    println("\n===NonGeneric===")
    val nGen = nonGeneric(100)
    val angkaNGen = nGen.hasil as Int
    println(angkaNGen + 50)

    println("\n===Generic 2 Parameter===")
    val city = kota("1234", 122323)
    println("kodepos kamu" + city.kodepos)
    println("no telp kamu: " + city.telp)

    println("===Generic Function===")
    println (fungsi(10))


    println ("\n===Generic Constraint===")
    println("Hasil Tambah:" + tambah(100.5))
    println("Hasil Kurang:" + kurang(100.5))
}