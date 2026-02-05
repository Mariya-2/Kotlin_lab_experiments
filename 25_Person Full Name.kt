class Person (val firstName: String, val lastName:String){
    val fullName: String
    get()="$firstName $lastName"
}
fun main() {
    val person=Person("Maria","Priscilla")
    println(person.fullName)
}
