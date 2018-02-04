package oop

open class Animal(){
    var name: String? = null
    var color: String? = null
    var numLegs: Int? = null

    constructor(name: String, color: String, numLegs: Int): this(){
        this.name = name
        this.color = color
        this.numLegs = numLegs

        println("Object: ${this.name}")
        println("Object: ${this.color}")
        println("Object: ${this.numLegs}")
    }

    constructor(name: String,color: String): this(){
        this.name = name
        this.color = color
        println("this is third constructor")
    }
}

class Lion(): Animal(){

}

fun main(args: Array<String>){
    var lion = Lion()
    var brownLion = Animal("catLion", "brown")
    lion.numLegs = 4
    println("lion's les number is ${lion.numLegs}")
    var dog = Animal("wang", "black", 4)

}