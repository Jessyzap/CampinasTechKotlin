package basico.ex0302

import java.util.*

/*
Crie um lista mutável de produto, adicione valores nela e mostre no final:
Quantidade de produto, Nome do Produto e o valor do produto vezes a quantidade.
Use Scanner e mutableListOf. Verifique a necessidade de criar funções no processo.
*/

fun main() {

    adicionarProdutos()
}

fun adicionarProdutos() {

    var i = 0
    val listaProdutos: MutableList<String> = mutableListOf()

    for (i in 0..2) {

        println("Digite o nome do produto: ")
        val produto = Scanner(System.`in`).nextLine()
        listaProdutos.add("'\n'Produto: $produto")

        println("Digite a quantidade: ")
        val quantidade = Scanner(System.`in`).nextLine()
        listaProdutos.add("Quantidade: $quantidade")

        println("Digite o valor: ")
        val valor = Scanner(System.`in`).nextLine()
        listaProdutos.add("Valor: $valor")

        val valorTotal = valor.toDouble() * quantidade.toDouble()
        listaProdutos.add("Valor total: $valorTotal'\n'")
    }

    println(listaProdutos)
}


