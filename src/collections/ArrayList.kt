package collections

fun main(args: Array<String>){

    var myArrayList = ArrayList<Book>()
    myArrayList.add(Book("java",20))
    myArrayList.add(Book("python",30))

    for(index in 0..myArrayList.size-1){

        println("I buy a book ${myArrayList.get(index).name}. It's price is ${myArrayList[index].price}")
    }

    for(element in myArrayList){
        println("It's really cool: ${element.name}")
    }

}


class Book(var name:String, var price:Int){

}