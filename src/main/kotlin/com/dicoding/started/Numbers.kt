package com.dicoding.started

//    val intNumber = 100
//    val longNumber: Long = 100
//    val longNumbers = 100L
//    val doubleNumber = 1.5
//    val bytenumber = 0b10101001

fun main() {

    /* Output is 2147483647 & -2147483648*/

    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    println ("The max value is $maxInt & the min value is $minInt")

    /* This operation has led to an overflow */
    val overMaxInt = maxInt + 1
    println(overMaxInt)

    val numberOne: Int = 10
    val numberTwo: Int = 29

    println(numberTwo / numberOne)
    print((5+4)*4)

    /* Example using conversion from byte to int*/
    val byteNumber: Byte = 100
    val intNumbers: Int = byteNumber.toInt()

    print(intNumbers)


    /* Example using conversion from string to int */
    val stringNumber = "1234"
    val intNumber = stringNumber.toInt() + 1234

    print(intNumber)

    /* Example write of readable number (using underscore for reading numeric value) */
    val readableNumbers = 3_1_0_000
    print(readableNumbers)
}