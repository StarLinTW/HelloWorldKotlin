package collections

fun main(args: Array<String>){
    var myArray = Array<Int>(5){2}
    myArray[2] = 100

    for(element in myArray){
        println("Item $element")
    }

    for(index in 0..myArray.size - 1){
        println("Item $index = ${myArray[index]}")
    }
}