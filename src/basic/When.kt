package basic

fun main(args: Array<String>){
//like java switch
    var age = readLine()!!.toInt()
    if (age !is Int) age = 20
    when(age){
        17 -> println("this is 17")
        18 -> println("this is 18")
        19 -> println("this is 19")
        else -> println("none of you inputs")
    }

}