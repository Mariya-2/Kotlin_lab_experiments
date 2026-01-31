fun main(){
  val a=3
  val b=9
  val c=2
  var l=c
  for(i in a..b){
    if(l==c){
      print(i)
      l=1
    }
    else l=l+1
  }
}
