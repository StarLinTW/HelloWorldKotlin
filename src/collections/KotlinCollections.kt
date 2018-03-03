package collections

fun main(args: Array<String>){

    //defalut is always immutable
    var myArrayList = listOf<String>("Me","James","Bonni","Life")

    for (item in myArrayList) println("Items $item")

    //make it mutable
    var mutableList = mutableListOf<String>("Me","2","3")
    mutableList[1] = "Cash"
    for (item in mutableList) println("Items $item")

    //HashMap
    var myHashMap = hashMapOf(1 to "Paulo", "haha" to "James")
    println("this is ${myHashMap["haha"]}")

    //Array
    var myArray = arrayOf(1,4,8,12)
    myArray[3] = 20
    for(item in myArray) println("myNum = $item")
}