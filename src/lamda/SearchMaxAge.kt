package lamda

fun main(args: Array<String>){

    val people = listOf(Person("kevin",29), Person("Alice",25))
    println(people.maxBy { it.age })
}


data class Person(val name: String, val age: Int)
