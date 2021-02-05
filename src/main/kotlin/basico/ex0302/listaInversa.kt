package basico.ex0302

import java.util.*

/*
Crie uma lista e faça com que ela mostre os valores ao contrário. Exemplo:
entrada: huelton, carlos, jose -> saida: jose, carlos, huelton
*/

fun main() {

    val listaFinal: MutableList<String> = mutableListOf()

    var i: Int
    for (i in 0..2) run {
        println("Digite nomes para a lista: ")

        val leitorNome = (Scanner(System.`in`).nextLine())
        listaFinal.add(leitorNome)
    }

    println("Lista invertida: ${listaFinal.reversed()}")
}


