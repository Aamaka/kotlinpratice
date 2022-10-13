package exercise

fun main() {
    println("Enter a character e.g 'a','b': ")
    val character = readLine()!!
    if(character.length > 1) println("$character is not a character") else {
        when (character.lowercase()[0]){
            in 'a'..'z' -> println("$character is an alphabet")
            !in 'a'..'z' -> println("$character is not an alphabet")
        }
    }

}

