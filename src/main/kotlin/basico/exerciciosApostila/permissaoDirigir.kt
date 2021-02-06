@file:Suppress("IMPLICIT_CAST_TO_ANY")

package basico.exerciciosApostila

/*
verificar se a pessoa é maior de 18 anos, se for, informar "Pode Dirigir ", senão "Não pode
Dirigir", verificar com operação ternaria se a pessoa é habilitada, (pessoa é habilitada se tiver uma
mensagem qualquer como parametro), caso não tenha mensagem, usar o default “, mostrar a
mensagem “em liberação", se for informado Null no campo de mensagem , deve por default informar
"habilitacao não autorizada", criar uma função e entrada de parametros pelo teclado, para esse
exercício.
*/

import java.util.*

fun main() {

    println("Digite a idade: ")
    val idade = Scanner(System.`in`).nextInt()
    println(permissaoDirigir(idade))

    val mensagem: String? = null // Habilitação não autorizada
    //val mensagem: String? = "mensagem"

    if (idade >= 18) {
        println(verificarHabilitacao(mensagem))
        //println(verificarHabilitacao()) // Em liberação
    }
}

fun permissaoDirigir(idade: Int) = if (idade >= 18) "Pode dirigir!!" else "Não pode dirigir!!"

fun verificarHabilitacao(mensagem: String? = "Em liberação"): String {

    if (mensagem == "mensagem") return "Habilitada!"
    if (mensagem == "") return "$mensagem"
    return mensagem ?: "Habilitação não autorizada"
}