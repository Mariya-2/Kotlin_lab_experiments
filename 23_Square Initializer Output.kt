class Square(
    val side:Int
)
fun main() {
    val side=5
    val square=Square(side=side)
    val perimeter=4*square.side
    println(perimeter)
}
