package basico.ex0302

import java.util.*

/*
Crie 1 função que receba os valores da lista e mostre conforme o enunciado do primeiro exercício.
Verifique a necessidade de criar funções no processo.
*/

fun main() {

    val listaFinal: MutableList<String> = mutableListOf()

    var i: Int
    for (i in 0..2) run {
        println("Digite nomes para a lista: ")

        val leitorNome = (Scanner(System.`in`).nextLine())
        listaFinal.add(leitorNome)
    }

    lista(listaFinal)
}

fun lista(listaFinal: MutableList<String>) {
    println("Lista invertida: ${listaFinal.reversed()}")
}