fun main(args: Array<String>){

    println("Enter a char: ")
    val ch = readln().uppercase()
    when(ch){
        "A" -> println("A is a vowel")
        "E" -> println("E is a vowel")
        "I" -> println("I is a vowel")
        "O" -> println("O is a vowel")
        "U" -> println("U is a vowel")
        else -> println("$ch is a Consonant")
    }

    when(ch){
        "A","E", "I", "O", "U" -> println("$ch is a vowel")
        "1","2", "3", "4", "5" -> println("$ch is a Number")
        else -> println("$ch is a Consonant")
    }

    println("Enter a number: ")
    val a :Int=Integer.valueOf(readln())
    when(a){
        in 1..10 -> println("A positive number less than 11.")
        in 10..100 -> println("A positive number between 10 and 100(inclusive)")

    }
}