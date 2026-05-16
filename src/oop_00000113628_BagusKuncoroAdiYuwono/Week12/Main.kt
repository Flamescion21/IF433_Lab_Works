package oop_00000113628_BagusKuncoroAdiYuwono.Week12

fun main(){
    println("=== TEST MULTIPLE CATCH ===")
    val account = BankAccount(100.0)

    try{
        account.withdraw(150.0)
    }catch(e: InsufficientFundsException){
        println("Caught domain error: uang tidak cukup ${e.message}")
    }catch(e: InsufficientFundsException){
        println("Caught argument error: input tidak valid ${e.message}")
    }catch(e:Exception){
        println("Caught general error: terjadi kesalahan tidak terduga")
    }
}