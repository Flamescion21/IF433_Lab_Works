package oop_00000113628_BagusKuncoroAdiYuwono.Week14

data class User(val name: String, val email: String, val age: Int)

class UserManager {
    //Business logic
    fun validateUser(user: User): Boolean {
        return user.email.contains("@") && user.age >= 18
    }

    //Database access
    fun saveUserToDatabase(user: User) {
        println("INSERT INTO users VALUES ('${user.name}', ${user.email}, '${user.age}')")
    }

    //Email notification
    fun sendwelcomeEmail(user: User) {
        println("Sending email to: '${user.email}'")
    }
}