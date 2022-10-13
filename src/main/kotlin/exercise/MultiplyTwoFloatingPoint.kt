package exercise

fun main(){
    println("Enter a floating point number: ")
    val number1 = readLine()!!.toFloat()

    println("Enter a floating point number: ")
    val number2 = readLine()!!.toFloat()

    val multiple = number1 * number2
    println("$number1 * $number2 = $multiple")


}