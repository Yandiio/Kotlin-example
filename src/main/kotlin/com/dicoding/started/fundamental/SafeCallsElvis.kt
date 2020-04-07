package com.dicoding.started.fundamental

fun main()  {
//    safe calls
//    prevent from the billion dollar mistake(NullPointerE)
//    val textNull: String? = null
//    val textLengths=  textNull?.length

    //elvis operator
    // set the default value when the object is null

    // Example
//    val textNulls: String? = null
//    val textLength = textNulls?.length ?: 8
//
//    print(textLength)
//

    // assertion(!!.)
    // use assetion when using or accessing the NPE (not reccomended)

//    val textExample: String? = null
//    val textLong = textExample!!.length

//    Test case

    val playerName: String
    var playerNumber: Int? = 10
    var playerClub: String? = "Manchester United"

    playerName = "Wayne Rooney"
    var result = playerNumber ?: 0
    val currentClub = playerClub

    val thisPlayer = """
        Player Name : $playerName
        Number : $playerNumber
        Current Club : $currentClub
    """.trimIndent()

    print(thisPlayer)



}
