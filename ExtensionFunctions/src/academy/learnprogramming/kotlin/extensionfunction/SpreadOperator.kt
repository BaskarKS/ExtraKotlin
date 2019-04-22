package academy.learnprogramming.kotlin.extensionfunction
import academy.learnprogramming.kotlin.extensionfunction.empList

fun main() {
    val manyNos = arrayOf(10,20,30,40)
    val someMoreNos = arrayOf(50,60,70)
    val comboNoSpread = arrayOf(manyNos,someMoreNos)
    for(each in comboNoSpread)
        println(each)
    val comboWithSpread = arrayOf(*manyNos,*someMoreNos, 80, 90, 100)
    println()
    for(each in comboWithSpread)
        println(each)

    val employeeDetails = ArrayList<Employee>()
    println(employeeDetails.javaClass)
    println(employeeDetails.add(Employee("Babu", 60)))
    println(employeeDetails.get(0))
    employeeDetails.set(0, Employee("Jashi", 100))
    println(employeeDetails.get(0))
}