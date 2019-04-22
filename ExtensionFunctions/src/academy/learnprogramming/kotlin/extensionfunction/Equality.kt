package academy.learnprogramming.kotlin.extensionfunction

fun main() {
    val empOne = Employee("Baskar", 100)
    val empTwo = Employee("Baskar", 100)
    val empThree = empTwo
    val empFour = Employee("Yuva", 200)

    println("check using == for content comparison")
    println(empOne == empTwo) //True // content comparison
    println(empTwo == empThree) //True //content comparison

    println(empThree == empFour) //False // content comparison

    println("check using .equals() for content comparison")
    println(empOne.equals(empTwo)) //True // content comparison
    println(empTwo.equals(empThree)) //True //content comparison

    println(empThree.equals(empFour)) //false // content comparison

    println("check Using === for reference comparison")
    println(empOne === empTwo) //false //reference comparison
    println(empTwo === empThree) //true //reference comparison
    println(empThree === empFour) //false //reference comparison

    //content not equality
    println("Check using != (not equality for content comp)")
    println(empOne != empTwo) //false // content not equality
    println(empTwo != empThree) //false // content not equality
    println(empThree != empFour) //true // content not equality

    println("check Using !== (not equality for reference comp")
    println(empOne !== empTwo) // true //reference not equality
    println(empTwo !== empThree) //false //reference not equality
    println(empThree !== empFour) //true //reference not equality

    val obj: Any = Employee("Geetha", 500)
    println(obj.javaClass)
    println(obj is Employee) // obj is an employee
    println(obj !is Employee) // obj not an employee

    if(obj is Employee) {
        //no need to cast obj as Employee, kotlin recognise using SmartCast
        println(obj.getEmployeeName())
    }
    //println(obj.getEmployeeName()) //unresolved reference
    println((obj as Employee).getEmployeeName())


}

