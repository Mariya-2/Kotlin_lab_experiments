fun main(args: Array<String>) {
    val v=listOf("viola","cello","violin")
    val b=v.asSequence().filter{it.startsWith("v")}.toList()
    println(b)
}
