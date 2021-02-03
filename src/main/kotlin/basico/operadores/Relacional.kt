package basico.operadores
import java.util.*

fun main() {

    // println("Jéssica" === "Jéssica") // validação de todos os tipos

    val d1 = Date(0) // kotlin determinado local na memoria
    val d2 = Date(0) // kotlin outro determinado local na memória

    println(d1 == d2)  // comparação de valores
    println(d1 === d2) // comparação local na memória

    println(3 != 2)
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    // visual g (e) e (ou)

    val x : Boolean = true
    val y : Boolean = true

    val z : Boolean = x || y // ou
    val w : Boolean = x && y // e
    val r : Boolean = x xor y // ou exclusivo (false, quando as variáveis forem iguais)

    println("Booleano: "+z)
    println("Booleano: "+w)
    println("Booleano: "+r)
}