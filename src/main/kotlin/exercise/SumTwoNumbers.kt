package exercise

fun main(){
    println("Enter the first number: ")
    val number1 = readLine()!!.toInt()

    println("Enter the second number: ")
    val number2 = readLine()!!.toInt()

    val sum = number1 + number2
    println("$number1 + $number2 = $sum")
}