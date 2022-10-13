fun main(){
    val numbers = intArrayOf(2, 5, 7, 8, 9)
    println("Enter a number: ")
    val userInput : Int = Integer.valueOf(readln())
    if(userInput in numbers){
        println("numbers array contains $userInput.")
    }
    else{
        println("numbers array does not contains $userInput.")
    }

    val a: Int = 5
    val b:Long = a.toLong()

    print("Conversion successful $b")
}