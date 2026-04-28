package oop_00000113628_BagusKuncoroAdiYuwono.week10

data class Coin(override val name: String, val balance: Double): Named
data class Transaction(val id: Int, val amount: Double)