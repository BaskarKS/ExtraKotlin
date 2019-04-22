package academy.learnprogramming.loops

fun main() {
    val range = 1..10
    val reverse = range.reversed()
    for (i in reverse)
        print("$i, ")
    println()
    val str = "GoodBye"
    for (index in 0..str.length)
        print(index) //print("${str[index]} ")

    println()
    for (index in  0 until str.length)
        print(str[index])

    println()
    val strRevRange = (str.length - 1).downTo(0)
    for(index in strRevRange) {
        print(str[index])
    }

    println()
    val revRangeStr = 0..(str.length - 1)
    for(index in revRangeStr.reversed())
        print(str[index])
    println()
    println(5 in revRangeStr)
    println(8 !in revRangeStr)

    val seasons = arrayOf("Summer", "Winter", "Autumn", "Spring")
    println("Fall not in seasons array => ${"fall" !in seasons}")

    for(index in seasons.indices)
        println(seasons[index])

    val babyName = "Jaasritha KS"
    println("KS" in babyName)
    println("KS" !in babyName)

    val namesOfFamily = arrayOf("Baskar", "Babu", "Ramani", "Yuva", "Sahitya", "Jaasritha", "Deva", "Uma")
    namesOfFamily.forEach { print("$it, ") }

    println()
    val someName = "Baskar K S"
    someName.forEach { print("$it, ")}
    println()
    someName.forEachIndexed { index, c -> println("$c and its Index is : $index")  }

loop@  for(i in 1..3)
       {
            println()
            print("$i, ")
            for (j in 1..4)
            {
                print("$j, ")
                for (k in 5..10)
                {
                    print("$k, ")
                    if(k == 7)
                        continue@loop
                }
            }

       }
}