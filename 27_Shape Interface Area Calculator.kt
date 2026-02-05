import kotlin.math.PI
interface Shape{
    fun computeArea():Double
}
class Circle(private val radius: Double):Shape{
    override fun computeArea():Double{
        return PI*radius*radius
    }
}
fun main() {
    val circle=Circle(7.0)
    println(circle.computeArea())
}
