package com.dicoding.started

// Correct
//val character = 'A'

// Incorrect character literal
//val character: Char = 'ABC'


fun main() {
    var chars = 'A'

    println("Vocal" + chars++)
    println("Vocal" + chars++)
    println("Vocal" + chars++)
    println("Vocal" + chars--)
    println("Vocal" + chars--)
}


/* How the char types worked?
    * The Character type is representation of the Unicode
    * Example A = 0041
    * if the expression of A is increment the result is 0042 or we know the result is stands for Unicode of B
 */