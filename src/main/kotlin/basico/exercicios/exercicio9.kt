package basico.exercicios

import java.util.*

fun main() {

    println("Digite um valor: ")
    val a = Scanner(System.`in`).nextInt()

    if (a >= 0){
        println("O valor $a não é negativo")
    } else {
        println("O valor $a é negativo")
    }
}