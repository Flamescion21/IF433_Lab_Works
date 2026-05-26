import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        val id = parts[0].toInt()
        val symbol = parts[1]
        val type = parts[2]
        val margin = parts[3].toDouble()
        val pnl = parts[4].toDouble()

        TradeRecord(id, symbol, type, margin, pnl)
    } catch (e: NumberFormatException) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("(Log) File: $path Tidak Ditemukan")
        emptyList()
    }
}

fun main() {
    val fileName = "crypto_trades.csv"
    val mockTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 123.0, 12.30),
        TradeRecord(2, "ETHUSDT", "Short", 234.0, -2.34),
        TradeRecord(3, "SOLUSDT", "Long", 456.0, 45.60)
    )
    saveTrades(mockTrades, fileName)

    File(fileName).appendText("CORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    val loadedData = loadTrades(fileName)
    val totalPnl = loadedData.sumOf { it.pnl }

    println("\n==== ENTRI TRANSAKSI YANG VALID ====")
    loadedData.forEach { trade ->
        println("ID: ${trade.id} | ${trade.symbol} (${trade.type}) | Margin: $${trade.margin} | PnL: $${trade.pnl}")
    }

    println("==== TOTAL PnL BERSIH: $totalPnl ====")

}