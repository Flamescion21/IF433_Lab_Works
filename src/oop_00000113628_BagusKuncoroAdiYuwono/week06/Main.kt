package oop_00000113628_BagusKuncoroAdiYuwono.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("->Memulai checkout....")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
   val pay2 = CreditCard()


   println("\n=== TESTING CHECKOUT ===")
   processCheckout(pay1, 50000.0)
   processCheckout(pay2, 150000.0)



    val SmartLamp1 = "Ruang Tamu"
    val SmartSpeaker1 = "Google Nest Dapur"
    val SmartCCTV = "Ezviz Garasi"
}