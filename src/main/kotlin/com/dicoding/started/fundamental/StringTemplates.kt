package com.dicoding.started.fundamental

fun main() {

    /*
    * Example using String template
    * String template can use for Int and double type
     */

//    val name = "Kotlin"
//    val old = 3
//    print ("Hi my name is $name and im $old years old")


    /*
    * Example using if-else in String template
     */

    val restaurantOpen = 10

    print ("Restaurant is ${if( restaurantOpen >= 10) "Open" else "close"}")
}