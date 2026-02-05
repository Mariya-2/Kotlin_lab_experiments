import kotlin.math.PI
class Circle constructor(val radius:Double){
    init {
        val area=PI*radius*radius
        println(area)
    }
    constructor(diameter: Int) : this(diameter/2.0)
}
fun main() {
    Circle(10)
}
