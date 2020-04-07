package com.dicoding.started.fundamental

fun main() {

//    example of string using indexing
//    val textString = "Kotlin"
//    val firstChar = textString[0]
//
//    print("first character of $textString is $firstChar")


//    example of get string value using for-loop
//    val text = "kotlin"
//    for(char in text){
//        print("$char ")
//    }

/*  Literal String
*   Literal String have 2 type : Raw String & Escaped String
*/

//   Example Using Escaped String
//    val statement = "Kotlin is awesome"
//    val stmt = "Kotlin is \"Awesome!\""
//
//    val stamet = "Kotlin not awesome \b isn't it?"
//
//    println(stamet)

//    Second Example : adding unicode into String
//    val name = "Unicode : \u0124"
//    print(name)


//    Example using raw string
    val thisText = """
        Line1
        Line2
        Line3
        Line4
    """.trimIndent()

    print(thisText)

}

