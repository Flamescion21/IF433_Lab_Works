package oop_00000113628_BagusKuncoroAdiYuwono.week05

abstract class PaymentMethod(val accountName: String){
    abstract fun processPayment(amount: Double)
}