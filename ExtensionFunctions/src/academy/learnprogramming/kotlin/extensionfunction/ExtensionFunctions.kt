package academy.learnprogramming.kotlin.extensionfunction

fun main() {
    println("Extension Functions")
    var myString = "baskar"
    println(myString.makeFirstLastCaps())

    println("adding ${20} with ${40} is ${20.addNumber(40)}")
}

fun String.makeFirstLastCaps(): String {
    return substring(0,1).toUpperCase() +
            substring(1, length - 1) +
            substring(length - 1, length).toUpperCase()
}

fun Int.addNumber(first: Int): Int  {
    return first + this
}