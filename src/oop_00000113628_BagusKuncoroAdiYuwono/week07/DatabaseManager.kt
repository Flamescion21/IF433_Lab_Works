package oop_00000113628_BagusKuncoroAdiYuwono.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is Ready")
    }
}