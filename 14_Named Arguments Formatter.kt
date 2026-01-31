fun formatMessage(name: String,uppercase: Boolean=true,prefix: String="#"){
    if(uppercase==true){
        var name=name.uppercase()
    }
    println("$prefix$name");
}
fun main() {
    formatMessage("Kotlin")
}
