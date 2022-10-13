package exercise

fun main(){
    println("Enter a number: ")
    var number1 = readLine()!!.toInt()

    println("Enter a number: ")
    var number2 = readLine()!!.toInt()

    val temp = number1
    number1 = number2
    number2 = temp
    println("number1 = $number1 and number2 = $number2")
}