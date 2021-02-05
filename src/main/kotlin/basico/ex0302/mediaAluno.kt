package basico.ex0302

import java.util.*

/*
Faça uma função que receba 4 notas e mostre a média do Aluno na tela:
A média do Aluno é: , use função e lista para poder criar o arquivo.
 */

fun main() {

    val listaNotas: MutableList<Double> = mutableListOf()
    var i: Int

    for (i in 0..3) {
        println("Digite a nota do aluno: ")
        val nota = Scanner(System.`in`).nextDouble()
        listaNotas.add(nota)
    }
    println("A média do aluno é: ${calculoMedia(listaNotas)}")

}

fun calculoMedia(listaNotas: MutableList<Double>): Double {

    var soma = 0.0

    for (nota in listaNotas) {
        soma += nota
    }
    val calculoMedia = soma / 4

    return calculoMedia
}


