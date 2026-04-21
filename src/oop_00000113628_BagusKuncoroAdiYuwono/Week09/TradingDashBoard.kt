package oop_00000113628_BagusKuncoroAdiYuwono.Week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, -10.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 25, 20.0, "CLOSED"),
        TradeLog("XRPUSDT", "LONG", 5, 0.0, "OPEN"),
        TradeLog("BNBUSDT", "SHORT", 8, -2.5, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 12, 8.3, "CLOSED")
    )

    val closedTrades = tradeHistory
            .filter { it.status == "CLOSED" }
}