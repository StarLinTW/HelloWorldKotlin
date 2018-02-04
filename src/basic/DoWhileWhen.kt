package basic

fun main(args: Array<String>){
    var isCorrect = false
    do {
        println("please guess a number~")
        var answer = readLine()!!.toInt()
        when(answer){
            17 -> {
                println("correct!!")
                isCorrect = true
            }
            else -> println("Incorrect!!!1")
        }
    }while (isCorrect == false)


}