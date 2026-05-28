package oop_00000113628_BagusKuncoroAdiYuwono.Week14
import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService {
    fun sendNotification(message: String)
}

interface PricingStrategy {
    val customerType: String
    fun calculate(price: Double): Double
}
class VipPricing : PricingStrategy {
    override val customerType: String = "VIP"
    override fun calculate(price: Double): Double = price * 0.90
}

class RegularPricing : PricingStrategy {
    override val customerType: String = "REGULAR"
    override fun calculate(price: Double): Double = price
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {



    fun processOrder(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy) {
        val finalPrice = pricingStrategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice (${pricingStrategy.customerType})")

        repo.saveOrder(itemName, finalPrice, pricingStrategy.customerType)

        notifier.sendNotification("Pesanan $itemName Anda telah dikonfirmasi!")
    }
}