package basico.exerciciosApostila

import java.util.*

fun main() {

    val lista: MutableList<Int> = mutableListOf()

    var i = 0

    while (i < 5) {
        println("Digite o número (posição" + (i + 1) + "): ")
        val numero = Scanner(System.`in`).nextInt()
        lista.add(numero)
        i += 1
    }
    println(verificarNumeros(lista))
    println(lista)
}

fun verificarNumeros(lista: MutableList<Int>): String {

    val resultado = when {
        lista[1] < lista[0] && lista[0] > lista[4]  -> "O 2º número não é maior que o 1º, e o 1º número é maior que o último"
        lista[1] > lista[0] && lista[0] > lista[4] -> "O 2º número é maior que o 1º, e o 1º número é maior que o último"
        lista[1] > lista[0] && lista[0] < lista[4] -> "O 2º número é maior que o 1º, e o último número é maior que o 1º"
        lista[1] < lista[0] && lista[0] < lista[4] -> "O 2º número não é maior que o 1º, e o último número é maior que o 1º"
        lista[0] > lista[4] -> "O 1º número é maior que o último número"
        lista[0] < lista[4] -> "O último número é maior que o 1º"
        lista[1] > lista[0] -> "O 2º número é maior que o 1º"
        lista[1] < lista[0] -> "O 2º número não é maior que o 1º"
        else -> "Os números maiores estão na 3ª e 4ª posição"
    }
    return resultado
}
