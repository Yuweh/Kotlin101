
// Kotlin — Mutable Properties

// Declaring an integer in Kotlin:
var age: Int = 15

//To declare a property with type inference:
var firstName = "Ray"

// Kotlin — Immutable Properties

val hoursInADay = 24
val secondsInAMinute = 60
val quote = "If you don't work smart, you will probably be replaced by an AI."

**the basic difference between declaring immutable properties in Kotlin and Swift are the val and let keywords.


// Kotlin - ARRAYS

/* Arrays
In both Swift and Kotlin, arrays have a fixed type — i.e., an array could be a collection of strings, for example, but not a mixture of strings and integers.
*/

/* Kotlin — MUTABLE Arrays and Lists
In Kotlin, arrays can be mutable, but are declared with a fixed size. In the following example we declare a mutable array in Kotlin with five elements, all set to a default value of zero:
*/

val numbers = Array<Int>(5){0}  

// To change the value of an item in the array:
numbers[1] = 2 //numbers is now (0, 2, 0, 0, 0)

// Example 2 of mutable Array LIST

var names = ArrayList<String>() //creates a list of strings, initially with no elements

//To add values to a Kotlin list:

names.add("Fuad") //index 0
names.add("Eric") //index 1
names.add("Joe") // index 2


// Kotlin — IMMUTABLE Arrays and Lists

//Declaring an immutable list in Kotlin
val days = arrayOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")



// Kotlin — DICTIONARIES
/* A dictionary (Swift) or map (Kotlin) is a very useful data structure when it comes to storing distinct values. While dictionaries and maps by default can expand, in both Kotlin and Swift, you can define their capacity for improved performance */

var namesWithAges = HashMap<String, Int>()
var namesWithAges = HashMap<String, Int>(20) //define capacity

//Assigning values:
namesWithAges.put("John Doe", 34)
//OR
namesWithAges["John Doe"] = 34

//Creating an immutable map:
val namesWithAges = mapOf("John Doe" to 34, "Jane Doe" to 29)



