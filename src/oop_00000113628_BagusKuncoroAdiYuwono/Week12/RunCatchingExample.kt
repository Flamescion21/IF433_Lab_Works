package oop_00000113628_BagusKuncoroAdiYuwono.Week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}