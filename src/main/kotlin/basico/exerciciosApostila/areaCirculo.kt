package basico.exerciciosApostila

import java.util.*
import kotlin.math.pow

fun main() {

    val leitor = Scanner(System.`in`)

    println("Digite um valor(double) para o raio do círculo: ")
    val r = leitor.nextDouble()

    println("A área do círculo é: ${areaCirculo(r)}")
}

fun areaCirculo(r: Double): Double {

    val pi = 3.14
    val elevacao = r.pow(2)
    val calculo = pi * elevacao

    return calculo
}

