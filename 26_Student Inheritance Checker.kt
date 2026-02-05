open class Person (){
    open fun role():String{
        return "Person"
    } 
}
class Student: Person(){
    override fun role():String{
        return "Student"
    }
}
fun main() {
    val student=Student()
    println(student.role())
}
