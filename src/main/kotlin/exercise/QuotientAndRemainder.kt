package exercise

fun main(){
    println("Enter a number: ")
    val number1 = readLine()!!.toInt()

    println("Enter a number: ")
    val number2 = readLine()!!.toInt()

    if (number1 > number2){
        val quotient = number1 / number2
        val remainder = number1 % number2
        println("quotient = $quotient and remainder = $remainder")
    }else if (number2 > number1){
        val quotient = number2 / number1
        val remainder = number2 % number1
        println("quotient = $quotient and remainder = $remainder")
    }
    else {
        println("quotient = 1 and remainder = 0 ")
    }
}