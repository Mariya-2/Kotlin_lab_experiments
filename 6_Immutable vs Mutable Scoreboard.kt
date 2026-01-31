fun main(args: Array<String>){
  val a=arrayOf("ADD 10","ADD 5","SUB 10","ADD 2")
  var s=0
  for(i in a){
    val p=i.split(" ")
    val op=p[0]
    val n=p[1].toInt()
    if(op == "ADD") s+=n
    else if(op == "SUB") s-=n
  }
  println("$s")
}
