package oop_00000113628_BagusKuncoroAdiYuwono.week10

val coinRepo = WalletRepository<Coin>()
val txRepo = WalletRepository<Transaction>()
val response = ApiResponse("200 OK", coinRepo.getAll())

fun main(){
    coinRepo.add(Coin("BTC", 64000.0))
    coinRepo.add(Coin("ETH", 65000.0))
    coinRepo.add(Coin("USDT", 70000.0))


    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Price: $${coin.balance}")
    }
    txRepo.add(Transaction(2, 1.5))





}
