package com.dicoding.started

//    Creating new function
//    fun functionName(param1: Type1,param2 : Type2,...) : returnType{
//        return results
//    }


fun setUser(name: String,password: String) = "Hi,Your name $name and your password is $password"

fun printUser(nickname: String) = println("Your Nickname is $nickname")

fun main() {
    val user = setUser("yandio","Vettel4ever")
    println(user)

    printUser("yandiio")
}