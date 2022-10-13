package exercise

fun main() {
    println("Enter a number: ")
    val number1 = readLine()!!.toInt()

    println("Enter a number: ")
    val number2 = readLine()!!.toInt()

    println("Enter a number: ")
    val number3 = readLine()!!.toInt()

    var max = 0
    if(number1 > number2){
        if(number1 > number3)
            max = number1
    }else if(number2 >number1){
        if(number2 > number3)
            max = number2
    }
    else
        max = number3

    println("max of $number1 , $number2 , $number3 is = $max")
}