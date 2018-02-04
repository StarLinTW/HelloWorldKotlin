package oop
class Login<T>(var name: T,var password: T){
    init {
        println("name == $name password == $password")
    }
}

class Person(var name: String, var age: Int){
    override fun toString(): String {
        return "[PersonName == $name PersonAge == $age]"
    }
}

fun main(args: Array<String>){
    var login = Login<String>("Kevin", "1234")
    println("name == ${login.name}")
    var kevin = Person("kevin", 29)
    var loginMyBank = Login<Person>(kevin, kevin)
}