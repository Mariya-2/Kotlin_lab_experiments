fun encodeMessage(msg: String,encoder:(String)->String):String{
    return encoder(msg);
}
fun main(args: Array<String>) {
    val res=encodeMessage("hello") {it.uppercase()}
    println(res)
}
