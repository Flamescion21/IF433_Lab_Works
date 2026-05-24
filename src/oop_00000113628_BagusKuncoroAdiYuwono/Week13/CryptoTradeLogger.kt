package oop_00000113628_BagusKuncoroAdiYuwono.Week13

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCSV(): String =
    "$id,$symbol,$type,$margin,$pnl"

fun fromCSVTrade(line: String) : TradeRecord? {
    return try {
        val parts = line.split(",")
        return TradeRecord(
            parts[0].toInt(),
            parts[1],
            parts[2],
            parts[3].toDouble(),
            parts[4].toDouble()
        )
    } catch (e: Exception) {
        println("Log: Data korup diabaikan: $line")
        null
    }
}