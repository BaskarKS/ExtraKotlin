package academy.learnprogramming.challenge7

fun main() {
    println("challenge7")
    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    //immutable map, key - lastName, value instance
    val personMap: Map<String,Person> = mapOf(
        joe.lastName to joe,
        jane.lastName to jane,
        mary.lastName to mary,
        john.lastName to john,
        jean.lastName to jean
    )
/*
    for(each in personMap)
        println(each)

    println(personMap.filter { it.key.toLowerCase().startsWith("s") }.count())
    println(personMap.filter { it.value.lastName.toLowerCase().startsWith("s") }.count())

    println()
    val firstN = personMap.map { it.value.firstName }
    val secondN = personMap.map {it.value.lastName}
    val namePairs = firstN.zip(secondN)
    println(namePairs)

    //or
    val namePairs1 = personMap.map { Pair(it.value.firstName,it.value.lastName) }
    println(namePairs1)


    val (fName, lName, age) = joe
    println("fname = $fName, lname = $lName, age = $age")

    //read also
    // Joe is 45 years old
    personMap.also {
        it.map {
            println("${it.value.firstName} is ${it.value.age} Years Old")
        }
    }

    //print items common in list2 and list1 4,15
    val list1 = listOf(1,4,9,15,33)
    val list2 = listOf(4,55,-83, 22,101,15)
    val list3 = list1.filter{ it in list2 }
    val list4 = list1.filter { list2.contains(it) }
    println("${list3.javaClass} => $list3")
    println("${list4.javaClass} => $list4")

*/
    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper
    //paper = Box<Premium>()
    println(regularPaper.javaClass)
    println(paper.javaClass)
}
class Box<out T> {

}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}

class Person(val firstName: String, val lastName: String, val age: Int) {
    override fun toString(): String {
        return "FirstName : $firstName, LastName : $lastName, Age : $age"
    }
}

