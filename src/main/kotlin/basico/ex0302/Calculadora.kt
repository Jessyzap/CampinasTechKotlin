package basico.ex0302

import java.util.*

/*
Crie um arquivo que contenha funções com as operações matemáticas: soma, subtração, multiplicação e módulo
O Usuário deve informar 2 números e fazer os cálculos de cada operação. Use Template String e crie funções para isso.
Mostre resultado na tela
 */

fun main() {

    println("Digite o 1º número: ")
    val a = Scanner(System.`in`).nextInt()

    println("Digite o 2º número: ")
    val b = Scanner(System.`in`).nextInt()

    println("A soma de $a + $b é: ${soma(a,b)}")
    println("A subtração de $a - $b é: ${subtracao(a,b)}")
    println("A multiplicação de $a * $b é: ${multiplicacao(a,b)}")
    println("O módulo de $a % $b é: ${modulo(a,b)}")
}


fun soma(a: Int, b: Int): Int {
    return a + b
}

fun subtracao(a: Int, b: Int): Int {
    return a - b
}

fun multiplicacao(a: Int, b: Int): Int {
    return a * b
}

fun modulo(a: Int, b: Int): Int {
    return a % b
}




