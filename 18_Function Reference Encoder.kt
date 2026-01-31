fun reverseText(text: String): String{
    return text.reversed()
}
fun processString(text: String,op:(String) ->String): String{
    return op(text)
}
fun main(args: Array<String>) {
    val v=reverseText("kotlin")
    println(v)
}
