package academy.learnprogramming.kotlin.extensionfunction

typealias empList = ArrayList<Employee>

fun main(args: Array<String>) {
    //val variable //Error either value or datatype to be specified
    val variableWithoutValue: Int
    val variableWithValue = 10
    val variableWithTypeValue: Long = 20

    variableWithoutValue = 100 // can be assigned for first time

    println("$variableWithValue")
    println(variableWithTypeValue)
    println(variableWithTypeValue.javaClass)

    val employeeOne : Employee
    val number: Int
    val numberOne = 20
    number = 10
    if (number < numberOne)
       employeeOne = Employee("Baskar", 101) //can be assigned for firstTime
    else
        employeeOne = Employee("Yuva", 102)
    println(employeeOne)
    println("${employeeOne.name} and ${employeeOne.id}")

    val employeeDetails: empList = ArrayList<Employee>()
    println(employeeDetails.javaClass)
    println(employeeDetails.add(Employee("Babu", 60)))
    println(employeeDetails.get(0))
    employeeDetails.set(0, Employee("Jashi", 100))
    println(employeeDetails.get(0))


}

class Employee(var name: String, val id: Int) {
    override fun toString(): String {
        return "$name and $id"
    }

/*
    override fun equals(other: Any?): Boolean {
        if (other is Employee) {
            return (this.name == other.name && this.id == other.id)
        }
        return false
    }
*/
    fun getEmployeeName() : String {
        return name
    }

    fun getEmployeeId() : Int {
        return id
    }
}