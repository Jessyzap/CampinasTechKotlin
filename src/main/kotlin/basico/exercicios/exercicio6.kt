package basico.exercicios

import java.util.*

fun main() {

    val leitor = Scanner(System.`in`)

    println("Digite uma palavra: ")
    val a: String = leitor.nextLine()

    println("A palavra ${palavra(a)} tem ${tamanho(a)} letras")
}

fun tamanho(a: String): Int  {

    return a.length
}

fun palavra(a: String): String  {

    return a
}