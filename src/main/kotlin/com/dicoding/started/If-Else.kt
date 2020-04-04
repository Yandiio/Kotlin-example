package com.dicoding.started

fun main() {
    val mainHour = 7
    val now = 7
    val office: String

//    if(mainHour < now){
//        office = "Office is Open"
//    } else{
//        office = "Office is closed"
//    }

    office = if (now > 7){
        "Office already open"
    }else if (now == mainHour){
        "wait a minute,office will be open"
    }else {
        "Office already closed"
    }

    print(office)
}