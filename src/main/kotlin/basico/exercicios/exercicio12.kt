package basico.exercicios

import java.util.*

fun main() {

    println("Digite um nome: ")
    val aluno = Scanner(System.`in`).nextLine()

    ultimoCaractere(aluno)
}

fun ultimoCaractere(aluno: String) {

    val aluno = aluno.get(aluno.length -1).toString()
    println("A última letra do nome digitado é: $aluno")
}