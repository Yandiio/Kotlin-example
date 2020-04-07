package com.dicoding.started.controlflow

fun main() {

//    Accessing the enum color
//    val getColor = Color.GREEN
//    print(getColor)

//    using valueOf & values
//      var colors:  Array<Color> = Color.values()
//      colors.forEach { color ->
//          print(color)
//      }
//      val color: Color = Color.valueOf("RED")



//    using enumValueof & enumValues()
//    val colors: Array<Color> = enumValues()
//    colors.forEach { color ->
//        println(color)
//    }

//    val color: Color = enumValueOf("GREEN")
//    print("Color is $color")


//    get positon using enum ordinal
//    val color: Color = Color.RED
//    print("Position of $color is ${color.ordinal}")

//   check enum expression? using enum when
//    val color: Color = Color.GREEN
//
//    when(color){
//        Color.GREEN -> print("Color is Green")
//        Color.RED -> print("Color is Red")
//        Color.BLUE -> print("Color is Blue")

}





    /*
     * example of enum
     */

enum class Color(val value: Int){
    RED(0xFF0000),
    BLUE(0x0000FF),
    GREEN(0x00FF00)
}


    /*
    * Using anonymous class for accessing enum
    */
//enum class Color (val value: Int){
//    RED(0xFF0000){
//        override fun printValue(){
//            println("Value of RED is $value")
//        }
//    },
//    GREEN(0x00FF00){
//        override fun printValue(){
//            println("Value of Green is $value")
//        }
//    },
//    BLUE(0x0000FF){
//        override fun printValue(){
//            println("Value of Blue is $value")
//        }
//    };
//
//    abstract fun printValue();
//}