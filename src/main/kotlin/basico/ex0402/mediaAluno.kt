package basico.ex0402

import java.util.*

/*
Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
aluno é aprovado). Escrever também a média calculada, use função
 */

fun main() {

    println("Digite a 1ª nota do aluno: ")
    val nota1 = Scanner(System.`in`).nextDouble()

    println("Digite a 2ª nota do aluno: ")
    val nota2 = Scanner(System.`in`).nextDouble()

    println(calculaMedia(nota1, nota2))
}

fun calculaMedia(nota1: Double, nota2: Double) =
    if(((nota1 + nota2) / 2) >= 6) "O aluno está aprovado! média: "+ ((nota1 + nota2) / 2)
    else "O aluno não está aprovado! média: " + ((nota1 + nota2) / 2)