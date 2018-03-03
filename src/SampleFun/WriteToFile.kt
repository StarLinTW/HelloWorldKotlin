package SampleFun

import java.io.FileWriter

fun main(args: Array<String>){
    var content = "We will have nice day tomorrow!"
    writeToFile(content)
}

fun writeToFile(content: String){

    var writer = FileWriter("message.txt")
    writer.write(content)
    writer.close()

}