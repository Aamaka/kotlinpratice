package exercise

fun main(){
    println("Enter a character: ")
    when(val letter = readLine()!!.uppercase()){
        "A","E", "I", "O", "U" -> println("$letter is a vowel")
        else -> println("$letter is a Consonant")
    }
}