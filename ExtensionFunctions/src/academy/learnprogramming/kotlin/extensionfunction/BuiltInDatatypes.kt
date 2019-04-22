package academy.learnprogramming.kotlin.extensionfunction

fun main() {
    var number = 10 // auto assigned data type based on value (only for Int)
    var newNumber: Int = 20 // explicit mention of Datatype
    println(number)
    println(newNumber)

    val shortValue: Short = 111
    val longValue: Long = 222 //explicit mentioning as Long
    val newLongVal = 100L // mention in value

    println("short value : $shortValue")
    println("long value : $longValue")
    println("mention DataType in value: $newLongVal and its class : ${newLongVal.javaClass}")

    println()
    val precisionDefault = 10.5
    println("precision default is $precisionDefault")
    println("default precision class ${precisionDefault.javaClass}")

    //for float value, mention in values compulsary
    val floatOne = 10.5f
    val floatTwo: Float = 15.5f
    println()
    println("datatype read from value $floatOne and its datatype ${floatOne.javaClass}")
    println("explicit mention dont help, still value type be specified $floatTwo and its Datatype is ${floatTwo.javaClass}")

    // No automatic value widening in Kotlin
    println()
    val byte: Byte = 10
    val byteCreatedOnAssign = byte
    println("$byteCreatedOnAssign and its datatype is ${byteCreatedOnAssign.javaClass}")


    //NO WIDENING SUPPORT
    val newByte: Byte = 15
    var intValue: Int = 100
    //intValue = byte //automatic widening is not supported in kotlin
    intValue = newByte.toInt() // explicit widening by programmer

    val intAuto = 10
    val precisionAuto = 10.5
    val charVal = 'c'
    //val newChar: Char = 65 //65 equivalent char is not assigned
    val newCharIntEqui = 65
    val newChar = newCharIntEqui.toChar()

    //only for Int Char, and Double dataType is auto assigned and
    // value widening happens
    println()
    println("value of $charVal and its class \"${charVal.javaClass}\"")
    println("new Char value : $newChar and its class \"${newChar.javaClass}\"")

    val anyType: Any = 10
    println()

    println("$anyType and its class ${anyType.javaClass}")

}