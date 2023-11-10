
fun main()
{
    val myName = "Gopi" //val value cannot be changed
    var age = 12 //var value can be changed
    age =  21
    val myChar : Char = 'D' //This is how we assign a character within single quotes
    val myBoolean:Boolean = false  //boolean datatype only takes two values True and False
    val myFloat = 2.5f //the float is automatically inferred as double so we need to explicitly indicate that its a float using f 
    val myDouble = 2.0  //we cannot explicitly specify the double datatype
    println("myChar: $myChar " )
    println("myBoolean: $myBoolean")
    println ("all the variables are: $myName $age")
    println("myFloat: $myFloat")
    println("myDouble: $myDouble")
}
/*Kotlin can infer datatypes automatically */