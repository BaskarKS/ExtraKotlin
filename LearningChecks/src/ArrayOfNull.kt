fun main() {
    println("Array of NUll")
    var nullableInts = arrayOfNulls<Int>(5)
    var index: Int = 0
    while(index < 5)
        nullableInts[index] = index++

    for(each in nullableInts)
        print("$each, ")

    //println(nullableInts[3].toString())

    println()
    val baskar = Person("Baskar")
    println(baskar.firstName)
}

internal class Person constructor(name: String) {
    val firstName: String
    init {
        firstName = name
    }
}