package collections

fun main(args: Array<String>){


    var hasmap = HashMap<String,String>()
//    var hasmap = HashMap<Any,Any>()

    hasmap.put("Marry","Married")
    hasmap.put("Paulo","Married")
    hasmap.put("John","Single")

    for (k in hasmap.keys) println(hasmap.get(k))

}