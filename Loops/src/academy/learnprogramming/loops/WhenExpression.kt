package academy.learnprogramming.loops

import java.math.BigDecimal

fun main() {
    var num = 600
    when(num)   {
        100 -> println("100 is Passed")
        200 -> println("200 is passed")
        300 -> println("300 is passed")
        else -> println("some value is passed")
    }
    //case contain multiple values separated by comma
    when(num)   {
        100, 600 -> println("100/600 is Passed")
        200 -> println("200 is passed")
        300 -> println("300 is passed")
        else -> println("some value is passed")
    }
    // case can be range
    num= 150
    when(num)   {
        in 100..199 -> println("Some value between 100-199")
        200 -> println("200 is passed")
        300 -> println("300 is passed")
        else -> println("some value is passed")
    }
    //case can be expression
    num = 90
    var y = 10
    when(num)   {
        90 + y -> println("100 passed")
        80 + y -> println("90 passed")
        else -> println("Not in Range")
    }
    //val something: Any = "Hello"
    //val something: Any = 45
    val something: Any = BigDecimal(12.5)
    val z = when(something) {
        is String -> println("Passed is String => $something")
        is Int -> println("passed is Integer => $something")
        is BigDecimal -> println("Passed is BigDecimal => $something")
        else -> println("None of the above data-types")
    }
    println(z)

    val ret = when(something) {
        is String -> {
                println("Passed is String => $something")
                1
            }
        is Int -> {
                println("passed is Integer => $something")
                2
        }
        is BigDecimal -> {
                println("Passed is BigDecimal => $something")
                3
        }
        else -> {
                println("None of the above data-types")
                -1
        }
    }
    println("Return value from When Block : $ret")

    /*if enum is passed, if all values of enum is used as case then else
    block is not required. If a case is not used then compulsary else block
    should be used.
    */
    val currentSeason = Season.SPRING
    val str = when(currentSeason) {
            Season.SUMMER -> "Its Hot"
            Season.WINTER -> "I need a Coat"
            Season.FALL -> "Its getting colder"
            Season.SPRING -> "Flowers are blooming"
    }
    println(str)

    //returning multiple data-types in when cases, shouldn't be done
    var number = 100
    val currSeason = Season.WINTER
    val returnVal = when(currSeason) {
        Season.SUMMER -> {
                        //returns Unit
                        number+=5
                        "Its Hot"
                        number+=20
                    }
        Season.WINTER -> {
            //returns String
            "I need a Coat"
        }
        Season.FALL -> "Its getting colder"
        Season.SPRING -> {
            //returns Unit
            "Flowers are blooming"
            number -= 20
        }
    }
    println(returnVal.javaClass)

    //when without a value
    val no = 100
    val no2 = -50
    when {
        no < no2 -> println(" no is < no2")
        no > no2 -> println("no is > no2")
        else -> println("bot numbers are equal")
    }
}

enum class Season {
    SPRING,SUMMER,WINTER,FALL
}
