package oop_00000113628_BagusKuncoroAdiYuwono.Week12

sealed class FeederExceptions(msg: String): Exception(msg)

class FoodEmptyException(requested: Int, available: Int): FeederExceptions("Kibble tidak cukup! diminta $requested gr, sisa $available gr")

class DispenserJamException: FeederExceptions("Wadah dispenser tersangkut/macet")