fun main(args :Array<String>){
  val a=mutableListOf("trumpet","piano","violin")
  val b=mutableListOf("REMOVE violin","ADD flute")
  for(i in b){
    val p=i.split(" ")
    val l=p[0]
    val m=p[1]
    if(l=="REMOVE") a.remove(m)
    else if(l=="ADD") a.add(m)
  }
  println(a)
}
