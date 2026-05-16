package oop_00000113628_BagusKuncoroAdiYuwono.Week12

class InsufficientFundsException(val amount: Double, val balance: Double): Exception("Attempted $amount,balance: $balance")