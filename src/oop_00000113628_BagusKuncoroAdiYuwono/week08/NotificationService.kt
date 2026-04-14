package oop_00000113628_BagusKuncoroAdiYuwono.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile){

        if(user.email != null){

            sendEmail(user.email!!)
        } else  {
            println("User ${user.name} tidak memiliki email")
        }
    }
}