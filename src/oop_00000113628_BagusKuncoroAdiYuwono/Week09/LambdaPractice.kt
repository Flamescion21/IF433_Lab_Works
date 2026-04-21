package oop_00000113628_BagusKuncoroAdiYuwono.Week09

fun main(){
    println("=== TEST LAMBDA ===")

    val sumLambda = {a: Int, b: Int -> a + b}
    println(sumLambda(5,10))

    val squareImplicit:(Int) -> Int = {it * it}
    println(squareImplicit(5))
}