package com.dicoding.started.controlflow

fun main() {
    setData();
}

fun setData(){
    val value = 7
    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }
}

fun outOfRange(){
    val value = 20
    when(value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("Value is 8")
        else -> print("Value out of range")
    }
}

fun validatioVar() {
    val value = 25
    val stringValue = when (value){
        6 -> println("Value is 6")
        7 -> println("Value is 7")
        8 -> println("Value is 8")
        else -> println("value out of range")
    }

    print(stringValue)
}

fun twoExpression() {
    val value = 30
    val stringsValue = when (value) {
        6 -> {
            print("Six")
            "Value is six"
        }
        7 -> {

        }
    }
}