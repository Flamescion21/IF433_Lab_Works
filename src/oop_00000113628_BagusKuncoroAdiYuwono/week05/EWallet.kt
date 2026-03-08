package oop_00000113628_BagusKuncoroAdiYuwono.week05

class EWallet(accountName: String, var balance: Double): PaymentMethod(accountName){
    override fun processPayment(amount: Double){
        if(balance < amount){
            println("Saldo tidak cukup")
        }else{
            balance -= amount
            println("Sukses")
        }
    }

    fun topUp(amount: Double){
        balance += amount
    }
}