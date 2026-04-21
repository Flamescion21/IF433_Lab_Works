package oop_00000113628_BagusKuncoroAdiYuwono.Test.Week09

fun main(){
    var arMhs = listOf("Budi","Susi","Titus")
    println("===LIST OF===")
    println(arMhs)
    println("panjang list ${arMhs.size}")
    println(arMhs[1])

    for(a in arMhs){
        println("nama Mahasiswa = ${a}")

    }
    println("===Mutable LIST===")
    var arAngka = mutableListOf(10,30,40,20,90,100,15)

    arAngka.add(777)

    arAngka[2] = 123

    arAngka.removeAt(3)

    println(arAngka)




    println("===SET OF===")
    var arUrutan = setOf(20,30,40,20,70,30,10,100)
    println(arUrutan.size)
    println(arUrutan)
    println("angka 40 ?" + arUrutan.contains(40))

    println("===MUTABLE SET OF===")
    var arMakanan = mutableSetOf("Nasi", "Bakpao", "Mie","Ayam")
    arMakanan.add("Ketoprak")
    arMakanan.add("Mie")
    arMakanan.remove("Nasi")
    println(arMakanan)

    println("===MAP OF===")
    var arSiswa = mapOf(
        "Andi" to 89,
        "Toni" to 73,
        "Ivander" to 90
    )

    println("Banyak siswa: ${arSiswa.size}")
    println("nilai si Andi" + arSiswa["Andi"])
    println("semua keys" + arSiswa.keys)
    println("Semua Values: " + arSiswa.values)
    println("Nama siswa index 1:" + arSiswa.keys.elementAt(1))
    println(arSiswa)


    println("===MUTABLE MAP===")
    var arMenu = mutableMapOf(
        "Nasi" to 1000,
        "Ayam" to 2000,
        "Sayur asem" to 1500
    )
    println("Banyak menu : " + arMenu.size)
    arMenu["Nasi"] = 500
    arMenu.remove("Ayam")
    arMenu.put("Ayam", 2500)
    println(arMenu)

    println("===MUTABLE MAP===")
    fun tambah(a: Int, b: Int): Int {
        return a+b

    }
    var kurang = {a: Int, b: Int -> a-b}

    println("Kurang: ${kurang(5,3)}")

    var pangkat = {x: Int -> x*x}
    var hitungPangkat:(Int) -> Int = {it * it}
    println("Pangkat: ${hitungPangkat(5)}")

    arSiswa.forEach {
        siswa ->  println(siswa)
    }
    for(sis in arSiswa){
        println(sis)
    }
}

