package oop

class Stock(num: String, name: String, price: Double){
    var num: String? = null
    var name: String? = null
    var price: Double? = null
    init {
        this.num = num
        this.name = name
        //this.price = price
    }
}

fun main(args: Array<String>){
    var myStock = Stock("1201", "和大", 160.8)
    println(myStock.price)
}