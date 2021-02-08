package basico.exerciciosApostila

import java.util.*

fun main() {

    println("Digite um nome: ")
    val nome = Scanner(System.`in`).nextLine()

    caixaAlta(nome)
}

fun caixaAlta(nome: String, DefaultNome: String = "Jéssica") {

    println("Nome $nome em caixa alta: ${nome.toUpperCase()}")
    println("Nome $DefaultNome em caixa alta: ${DefaultNome.toUpperCase()}")
}