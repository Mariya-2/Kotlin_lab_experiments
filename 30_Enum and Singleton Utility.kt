enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255)
}
object ColorPrinter {
    fun printRGB(color: Color) {
        println("${color.r}, ${color.g}, ${color.b}")
    }
}
fun main() {
    ColorPrinter.printRGB(Color.RED)
}
