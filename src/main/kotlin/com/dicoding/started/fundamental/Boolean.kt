package com.dicoding.started.fundamental

fun main() {
    val restaurantOpen = 9
    val currentTime = 8
    val isOpen = currentTime > restaurantOpen


//   using && (and) for checking double condition if the value true
//    val isOpen = currentTime >= restaurantOpen && currentTime <= restaurantClose
//    print("Restaurant is open : $isOpen")

//    using || (or) for check the one of the true condition
//    val isClosed = currentTime >= restaurantClose || currentTime <= restaurantOpen
//    print("Restaurant is closed : $isClosed")


//    using != (negation) for reverse value of expression
    if(!isOpen){
        print("restaurant is closed")
    }else {
        print("restaurant is open")
    }
}