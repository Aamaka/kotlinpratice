package exercise

fun main(){
    println("Enter a sentence: ")
    val sentence = readLine()!!

    println("Enter a letter to be found in your sentence: ")
    val letter = readLine()!!

    var count = 0

    for (i in sentence){
        if(letter == i.toString()){
            count++
        }
    }
    println(count)
}