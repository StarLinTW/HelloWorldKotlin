package oop

interface InputHandler{
    fun clicked()
}


class Phone: InputHandler {
    override fun clicked() {
        println("I'm clicked")
    }
}

//abstract----------
abstract class GraphicObject{

    fun moveTo(newX: Int, newY: Int){
        println("move to newX $newX and newY $newY")
    }

    abstract fun draw()
    abstract fun resize()
}

class Circle: GraphicObject(){
    override fun draw() {
        println("drawing circle")
    }

    override fun resize() {
        println("resizing circle")
    }

}

fun  main(args: Array<String>){
    var acerPhone = Phone()
    acerPhone.clicked()

    var circle = Circle()
    circle.resize()
    circle.moveTo(8,8)
}