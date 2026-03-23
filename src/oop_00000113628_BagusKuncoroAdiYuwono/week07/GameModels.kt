package oop_00000113628_BagusKuncoroAdiYuwono.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(dropChance = 70),
    UNCOMMON(dropChance = 18),
    RARE(dropChance = 8),
    EPIC(dropChance = 3),
    LEGENDARY(dropChance = 1),
}