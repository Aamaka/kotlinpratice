import java.util.Scanner

fun main(){
    val reader = Scanner(System.`in`)
    println("Enter a number: ")

    val number:Int = reader.nextInt()

    println("Enter a number: ")
    val number1:Int = reader.nextInt()
    val sum = number + number1
    println("The sum of the numbers is $sum")

    val max:Int
    if(number > number1){
        max = number
        println("The maximum number is $max")
    }else if(number == number1){
        println("numbers are equal")
    }
    else{
        max = number1
        println("The maximum number is $max")
    }

}