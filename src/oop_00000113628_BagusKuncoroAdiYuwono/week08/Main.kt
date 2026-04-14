package oop_00000113628_BagusKuncoroAdiYuwono.week08

fun main(){
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val desination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("tujuan pengiriman: $desination")

    println("\n=== TEST LET BLOCK ===")
    val valiOrder = Order(null, 250000)

    val receipt = valiOrder.totalPrice?.let { price ->

        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di set!"

    println(receipt)
}
