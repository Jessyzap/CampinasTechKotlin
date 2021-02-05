package basico.exercicios

import java.util.*

fun main() {

    println("Digite um nome: ")
    val nome = Scanner(System.`in`).nextLine()

    caixaAlta(nome)
}

fun caixaAlta(nome: String, Defaultnome: String = "Jéssica") {

    println("Nome $nome em caixa alta: ${nome.toUpperCase()}")
    println("Nome $Defaultnome em caixa alta: ${Defaultnome.toUpperCase()}")
}