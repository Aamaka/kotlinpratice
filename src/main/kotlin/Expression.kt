

fun main(args:Array<String>){
//    val number = 5
//    val result = if (number > 0)"Positive number" else "Negative number"
//    println(result)
//    val a = -9
//    val b = -11
//    val max = if(a > b){
//        println("$a is larger than $b")
//        println("max variable holds value of a")
//        a
//    }else{
//        println("$b is larger than $a.")
//        println("max variable holds value of b")
//        b
//    }
//    println("max = $max")


    println("Enter the first number: ")

    val n1 :Int = Integer.valueOf(readln()!!)

    println("Enter the second number: ")
    val n2: Int = Integer.valueOf(readln()!!)

    println("Enter the third number: ")
    val n3 : Int = Integer.valueOf(readln()!!)
    val max = if(n1 > n2){
        if(n1 > n3){
            n1
        }else
            n3
    }else{
        if (n2 > n3)
            n2
        else
            n3
    }
    println("max = $max")
}