package academy.learnprogramming.kotlin.extensionfunction

fun main() {
    var names = arrayOf("Baskar", "Balu", "Jashi", "Geetha", "babu", "Ramani")
    names.set(0, "check")
    for (each in names)
        print("$each ,")

    var newNames = mutableListOf<String>("Baskar", "balu")
    newNames.add("Jashi")
    newNames.add(0,"Ramani")
    println()
    println(newNames.javaClass)
    for(each in newNames)
        print("$each, ")

    println()
    var longArray = arrayOf(10L,20L,30, 40)
    println("is longArray is array<Long> : ${longArray is Array<Long>}")

    val anotherLongArray = arrayOf<Long>(100,200,300)
    println("is anotherLongArray is array<Long> : ${anotherLongArray is Array<Long>}")
    println(anotherLongArray[1])
    println(anotherLongArray.javaClass)

    val evenNos = Array(10) { i -> i * 2}
    evenNos.forEach { print("$it, ") }

    println()
    val nos = Array(20) {i -> i+1}
    nos.forEach { print("$it, ") }

    println()
    val numZero = Array(10){0}
    numZero.forEach { it -> 10}
    numZero.forEach {  print("$it, ") }
    println()
    println(numZero.javaClass)

    val someVal = Array(10){1;2;3;4;5}
    someVal.forEach { print("$it, ") }
    println()

    val primArray = intArrayOf(11,12,13,14)
    val primArrayOne = IntArray(10) //without initializers
    val collectionArray = primArrayOne.toTypedArray()
    val primiArray = collectionArray.toIntArray()
    println(collectionArray.javaClass)
    println(primArrayOne.javaClass)
    println(primiArray.javaClass)
}