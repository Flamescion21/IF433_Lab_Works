package oop_00000113628_BagusKuncoroAdiYuwono.Week14

class MySQLDatabase {
    fun query(sql: String): List<String> = listOf("detail, data2")
}

class userService {
    private val database = MySQLDatabase()
    fun getUser(id: Int) = database.query("SELECT * FROM users WHERE id = $id")
}