package oop_00000113628_BagusKuncoroAdiYuwono.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {

    fun calculateFine(): Int {
        var denda = 0

        if (loanDuration > 3) {
            denda = (loanDuration - 3) * 2000
        } else {
            denda = 0
        }
        return denda
    }
}