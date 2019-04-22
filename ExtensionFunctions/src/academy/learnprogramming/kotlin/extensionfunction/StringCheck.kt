package academy.learnprogramming.kotlin.extensionfunction

class BankBranch {
    class Address {
        class Country {
            val countryCode: String? = "US"
        }
        val country: Country? = Country()

    }
    val address: Address? = Address()
}
val bankBranch: BankBranch? = BankBranch()
val countryCode: String? = bankBranch?.address?.country?.countryCode?:"Default"
val country: String = countryCode?:"Any"

fun main() {
    val str: String? = null
    println("Check for null and evaluate to uppercase : ${str?.toUpperCase()}")
    println(countryCode)
    println(country + " "+ countryCode)

    val someArray: Any = arrayOf(1,2,3,4)
    val str1: String? = someArray as? String
    println(str1)
}


