fun main() {
//    println("Enter year: ")
//    val year = Integer.valueOf(readln())
//
//    if(year % 4 == 0 && year % 100 != 0){
//        println("It is a leap year")
//    }
//    else if(year % 400 == 0 && year % 100 == 0){
//        println("It is a leap year")
//    }
//    else{
//        println("it is not a leap year")
//    }
    var sum = 0
    var num = 1
    while (num in 1..100) {
        sum += num
        num++
    }
    println(sum)
}