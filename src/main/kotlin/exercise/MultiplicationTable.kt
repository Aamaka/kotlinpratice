package exercise

fun main() {
    println("Enter a number: ")
    val number = readLine()!!.toInt()

    var mul: Int
    for (i in 1..12) {
        mul = i * number
        println("$number * $i = $mul")
    }
}