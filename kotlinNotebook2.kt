/*Operators */
fun main()
{
    val number1 = 12
    val number2 = 10
    val result1 = number1 + number2
    println(result1)
    //Now the wierdest thing I have ever seen before


    val (num1, num2) = 10 to 12  // What is this wierdest thing (It's using the destructuring declaration of Kotlin)
    val result = addNumbers(num1, num2) // This we all know about the function call
    println(result)
}
fun addNumbers(num1: Int, num2:Int): Int {  //a new function for adding numbers
    return num1 + num2
}
//One more thing is that we can use line breaking like \n that we used in C and C++ in Kotlin as well