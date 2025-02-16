//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


// const should be defined outside the function and will never change , value must be know before execution

const val PI = 3.14

fun main() {


    var number: Int = 10     // integers

    var long: Long =100L // long for longer integers/numbers

    val double: Double = 3.2 //double for shorter decimals

    var float: Float = 3.44F // float for longer decimals

    var b: Boolean = true // true/false

    var s: String = "Clinton"

    var c: Char = 'C' // for single characters, should be in single quotes

    var any: Any = 10 // any datatype, declare specific data types

    var name: String? = "Learning" // declare nullable variable
    name = "null safety"
    println(name?.uppercase()) // prints uppercase if not null and null if null


    var course: String? = "Kotlin" // declare nullable variable
    course = null
    println(course?.uppercase()) // prints null
    // variable types can be inferred
    // var mutable, val immutable

}