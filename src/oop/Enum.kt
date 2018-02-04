package oop

enum class Suits{
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}

fun main(args: Array<String>){

    var cardPlayer = Suits.DIAMONDS
    if(cardPlayer == Suits.DIAMONDS) println("this is Diamonds")
}