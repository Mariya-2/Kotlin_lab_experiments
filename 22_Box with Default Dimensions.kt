class Box(
    val length:Int,
    val width:Int=20,
    val height: Int=40
)
fun main() {
    val length=10
    val box=Box(length=length)
    val volume=box.length*box.width*box.height
    println(volume)
}
