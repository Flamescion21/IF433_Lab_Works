package oop_00000113628_BagusKuncoroAdiYuwono.Week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
    val safeValue = result.getOrElse { -1 }
    println("safe value: $safeValue")

    val recovered = result.recover{0}.getOrNull()
    println("recovered: $recovered")
}