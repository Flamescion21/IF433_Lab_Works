package oop_00000113628_BagusKuncoroAdiYuwono.Test

import javax.swing.Spring.height

open class Animal {
    open fun sound(){
        println("animal sound")
    }
}

class Dog : Animal(){
    override fun sound(){
        super.sound()
        print("bark")
    }
}

fun main(){
    Dog().sound()
}