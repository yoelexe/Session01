import kotlin.math.pow

// es la entrada y se autoinvoca
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

    // suma
    println(2+2)
    // resta
    println(2-2)
    // división
    println(2/2)
    // modulos
    println(2%2)
    // multiplicación
    println(2*2)
    // potencia
    println(2.0.pow(2))

    // Operación matematica
    println( 1 + (9 / 3) * 2)

    // comparación e igualdad operadores
    println(2 == 2)
    println(2 != 2)
    println(2 < 2)
    println(2 > 2)
    println(2 <= 2)
    println(2 >= 2)

    // Operadores de asignación
    var anyNumber: Int = 0
    anyNumber += 10
    anyNumber -= 2
    anyNumber *= 2
    anyNumber /= 2
    anyNumber %= 2
    anyNumber++
    anyNumber--
    println(anyNumber)

    var isTrue : Boolean = true
    var isFalse : Boolean = false
    // Operadores booleanso logicos
    // AND
    println(isTrue && isFalse)
    // OR
    println(isTrue || isFalse)
    // NOT
    println(!isTrue)

    helloWorld()
    var num : Int = dobletheValue( 2)
    println(num)

    favouriteFoodPrompt("Karen", "salchipapa")
    favouriteFoodPrompt()
}

fun helloWorld(){
    println("Hello world")
}

// retorna el doble de un valor, entra un entero y sale un entero
//                          entrada    salida
fun dobletheValue(numberValue: Int) : Int{
    return numberValue * 2
}

// anynomuas -> por defecto lo asignas
fun favouriteFoodPrompt(name: String = "Anonymous", favouriteFood: String = "Pizza"): Unit{
    println("$name's favourite food is $favouriteFood")
}