fun main(args: Array<String>){
//    var sum = 0
//    var number: Int
//    while(true){
//        println("Enter a number")
//        number = readLine()!!.toInt()
//        if(number == 0)
//            break
//        sum+= number
//    }
//    println("sum = $sum")

//    first@ for(i in 1..4){
//        second@ for (j in 1..2){
//            println("i = $i, j = $j")
//            if(i == 3)
//                break@first
//        }
//    }
    var num = 4
    outer@ while (num > 0){
        var num2 = 4
        inner@ while(num2 > 0){
            if(num == 2)
                break@outer
            println("num = $num, num2 = $num2")
            num2--
        }
        num--
    }

}