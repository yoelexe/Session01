fun main(){
    // Boolean -> 1bit false/true
    // Bytes -> 8bit -127 to 128
    // Char -> 16bit 'a' to 'z' '/n' '101'

    // Numbers

    /*
     Double -> 64bit 3.4D
     Float -> 32bit 3.4f
     Int -> 32bit -2 -1 0 1 2
     Long -> 64bit -2L -1L 0L 1L 2L
     Short -> 16bit none
     */

    // String 'Hello'
    // Array of int [1,2,3]

    // declarar variables
    // val -> constante, a traves del tiempo no cambia
    val dayOfBirth : Int = 20
    val monthOfBirth : Int = 1
    println("My birthday is $dayOfBirth/$monthOfBirth")
    println("My birthday is: " + dayOfBirth + "/" + monthOfBirth)

    // si se puede cambiar
    var name : String = "Karen"
    var lastName : String = "Huaman"
    println("My name is ${name.uppercase()} ${lastName.lowercase()}")

    name = "Martina"
    println("My name is $name")
}