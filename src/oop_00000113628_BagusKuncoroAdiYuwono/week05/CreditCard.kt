package oop_00000113628_BagusKuncoroAdiYuwono.week05

class creditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0): PaymentMethod(accountName){
    override fun processPayment(amount: Double){
        if(usedAmount + amount < limit){
            usedAmount += amount
            println("Sukses")
        }
    }
}