package oop_00000113628_BagusKuncoroAdiYuwono.Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0){
        "porsi kibble harus lebih dari 0gr"
    }
    if(isJammed){
        throw DispenserJamException()
    }
    if(requestedGram > availableGram){
        throw FoodEmptyException(requestedGram, requestedGram)
    }
    return availableGram - requestedGram
}