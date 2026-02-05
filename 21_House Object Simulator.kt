class House(
    val color:String="Blue",
    val windows:Int=2,
    var isForSale:Boolean=false
){
fun putOnSale(){
    isForSale=true
}
}
fun main() {
    val house=House()
    house.putOnSale()
    println(house.isForSale)
}
