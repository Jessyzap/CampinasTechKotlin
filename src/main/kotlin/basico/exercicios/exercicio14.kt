package basico.exercicios

import java.util.*

fun main() {

    println("Digite a nota do aluno: ")
    val nota = Scanner(System.`in`).nextDouble()
    verificarNota(nota)
}

fun verificarNota(nota: Double) {

    when(nota) {
        10.0 -> println("Ótimo, execelente nota, passou de ano!!")
        9.0 -> println("Boa nota, passou de ano!")
        8.0 -> println("Passou de ano!")
        else -> println("Nota não esperada, não passou!")
    }
}