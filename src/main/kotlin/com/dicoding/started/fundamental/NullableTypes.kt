package com.dicoding.started.fundamental

fun main() {

    /*  bad practice using nullable type */

    //   val text: String = null

    /* best practice using nullable type
    * adding '?' after decide type of object
    */


    // bad example
    // val text: String? = null
    // val textLength = text.length

    // Good example

    val text: String? = null

    if(text != null) text.length
}

