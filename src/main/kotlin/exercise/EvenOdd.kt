package exercise

fun main(){
    println("Enter a number e.g 8, 9: ")
    val number = readLine()!!.toInt()
    if(number % 2 == 0) println("It is even")else println("It is odd")


}