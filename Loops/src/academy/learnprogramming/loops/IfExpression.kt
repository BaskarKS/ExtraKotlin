package academy.learnprogramming.loops

fun main() {
    val somecondn = 15 > 10
    println("The result of If expression " +
            "${ if (somecondn) {
                    println("If Block Passed")
                    50
                }
                else {
                    println("Else block passed")
                    593
                } }")
    val x = if(somecondn) {
                println("If doesn't return anything")
            }
            else    {
                println("Else doesn't return anything")
            }
    println(x.javaClass)
}