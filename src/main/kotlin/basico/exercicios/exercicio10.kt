package basico.exercicios

import java.util.*

fun main() {

    println("Digite um valor: ")
    //val a: Int? = null
    val a: Int = Scanner(System.`in`).nextInt()

    //verificarNulo(a)
    verificacaoValor(a)
}

fun verificarNulo(a: Int?) {
    val nulo = if (a == null) "O valor é nulo" else "O valor não é nulo"
    println(nulo)
}

fun verificacaoValor(a: Int) {
    val valor = if (a > 10) "O valor é maior que 10" else "O valor não é maior que 10"
    println(valor)
}