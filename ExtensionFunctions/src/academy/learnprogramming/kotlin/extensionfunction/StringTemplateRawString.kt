package academy.learnprogramming.kotlin.extensionfunction

fun main() {
    val change = 4.33
    println("to show the value of change we use \$change")
    println("to show the value of change we use $change")
    println("to show the value of change we use $$change")

    val numerator = 10
    val denominator = 2
    println("value of numerator $numerator divided by denominator" +
            " $denominator is ${numerator/denominator}")

    //RawStrings
    val someString = """Raw strings in triple quotes
                        no need to escape \ and other symbols,
                        cant use newline or tab"""
    val rhyme = """Rain Rain go away, come again another day,
                |little johny wants to play, rain rain go away""".trimMargin()
    val newRhyme = """Johny Johny Yes papa,
                     *eating sugar NO papa,
                     *Telling lies no papa,
                     *Open Your mouth,
                     *Ha Ha Ha""".trimMargin("*")
    println(someString)
    println()
    println(rhyme)
    println()
    println(newRhyme)
}