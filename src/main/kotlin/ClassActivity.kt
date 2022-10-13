fun main(){
    println("Enter time in a 24hour format e.g 14:00 ")
    var time = readln()
//    if(time > 12){
//        time %= 12
//        println("The time is $time:00pm")
//    }else{
//        println("The time is $time:00am")
//    }

    if(time.length > 5 || time.length < 5){
        println("Invalid format")
//        throw InvalidTimeFormatException("Invalid format")
    }

//    val index = time.indexOf(":")
    val index = 2
    var hour = Integer.valueOf(time.substring(0,index))
    val minutes = time.substring(index+1, time.length)
    when(hour){
        in 1..12 -> println("$hour:$minutes am")
        in 13..24 ->{
            hour %= 12
            println("$hour:$minutes pm")
        }
        !in 1..24 -> println("hour must be between 1 - 24")
    }
}


