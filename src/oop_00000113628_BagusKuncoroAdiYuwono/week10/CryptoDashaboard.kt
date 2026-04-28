package oop_00000113628_BagusKuncoroAdiYuwono.week10

val coinRepo = WalletRepository<Coin>()
fun main(){
    coinRepo.add(Coin("BTC", 64000.0))
    coinRepo.add(Coin("ETH", 65000.0))
    coinRepo.add(Coin("USDT", 70000.0))
}
