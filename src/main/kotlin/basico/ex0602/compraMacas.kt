package basico.ex0602

/*
As maçãs custam R$ 4,30 cada se forem compradas menos de uma dúzia, e R$ 4,00 se forem
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
escreva o custo total da compra.
 */

fun main() {

    println("Digite a quantidade de maçãs: ")
    val quantidade = readLine()!!.toInt()

    println(calculaMacas(quantidade))
}

fun calculaMacas(quantidade: Int): String {

    var valorTotal = 0.0
    valorTotal = if (quantidade < 12) 4.30 * quantidade
    else 4.00 * quantidade

    return ("O valor total de $quantidade maçãs é R$${"%.2f".format(valorTotal)}")
}