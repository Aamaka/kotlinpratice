package exercise

fun main() {
    println("Enter a year: ")
    val input = readln().toInt()

    if(input % 4 == 0 && input % 100 != 0){
        println("It is a leap year")
    }
    else if(input % 400 == 0 && input % 100 == 0){
        println("It is a leap year")
    }
    else{
        println("it is not a leap year")
    }

}