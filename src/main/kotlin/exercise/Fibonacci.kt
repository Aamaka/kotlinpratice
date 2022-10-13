package exercise

fun main() {
    println("Enter a whole number: ")
    val number = readln().toInt()

    var a = 0
    var b = 1
    var c :Int

    print("$a $b")
    for (i in 2 until number){
        c = a + b
        print(" $c")
        a = b
        b = c
    }

}