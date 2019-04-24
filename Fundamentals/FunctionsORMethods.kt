
// Kotlin - Prototype of a Kotlin function:

fun functionName(parameterName: DataType): ReturnType {
  //function body
}

/*
The return type of a function is represented by a colon :. In Kotlin, all functions have a return type; if you don’t specify the return type, a special type Unit will be returned by default.

Here’s an example of a Kotlin function: */

fun greetUser(name: String): String {
  return "Hello ${name}!"
}


/*Kotlin — Default Argument

In Kotlin, a default value can be assigned to a parameter. For instance, take the example of the above function. */

fun greetUser(name: String = "World"): String {
  return "Hello ${name}!"
}

//Now, the above function can be called without passing an argument like this:

greetUser() //returns Hello World!







