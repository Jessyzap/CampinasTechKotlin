package basico.exercicios

import java.util.*

fun main() {

    val lista : MutableList<String> = mutableListOf()

    println("Digite o nome do aluno: ")
    val aluno = Scanner(System.`in`).nextLine()

    println("Digite a 1ª nota do aluno: ")
    val nota1 = Scanner(System.`in`).nextLine()
    lista.add("1ª nota: $nota1")

    println("Digite a 2ª nota do aluno: ")
    val nota2 = Scanner(System.`in`).nextLine()
    lista.add("2ª nota: $nota2")

    println("Digite a 3ª nota do aluno: ")
    val nota3 = Scanner(System.`in`).nextLine()
    lista.add("3ª nota: $nota3")

    println(aluno)
    println("Notas")
    println(lista)
    println("Resultado da ${lista[1]}")
}

