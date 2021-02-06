package basico.ex0402

import java.util.*

/*
Um posto XELL está vendendo combustíveis com a seguinte tabela de descontos:
Álcool
até 20 litros, desconto de 3% por litro
acima de 20 litros desconto de 5% por litro

Gasolina
até 20 litros desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro

Escreva um programa que leia o número de litros vendidos e o tipo de combustível
(codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor
a ser pago pelo cliente, sabendo-se que o preço do litro da gasolina é R$ 4,60
e o preço do litro do álcool é R$ 3,20. Use a função e um layout bonito para o funcionário
que esta calculando o valor, use função.
 */

fun main() {

    println(layout())
    insereValores()
}

fun layout() {

    println("|================================|")
    println("|             ÁLCOOL             |")
    println("|================================|")
    println("| PREÇO R$ 3,20L                 |")
    println("|                                |")
    println("| Até 20L - Desconto de 3%L      |")
    println("| Acima de 20L - Desconto de 5%L |")
    println("|--------------------------------|")
    println()
    println("|================================|")
    println("|            GASOLINA            |")
    println("|================================|")
    println("| PREÇO R$ 4,60L                 |")
    println("|                                |")
    println("| Até 20L - Desconto de 4%L      |")
    println("| Acima de 20L - Desconto de 6%L |")
    println("|--------------------------------|")
}

fun insereValores() {

    println("Digite a quantidade de litros: ")
    val quantidadeLitros = Scanner(System.`in`).nextInt()

    println("Digite o tipo de combustível: ")
    val tipoCombustivel = Scanner(System.`in`).nextLine()

    if ((tipoCombustivel == "G-gasolina") || (tipoCombustivel == "A-alcool")) {
        println("O valor total a pagar é R$ ${"%.2f".format(calculaCombustivel(tipoCombustivel, quantidadeLitros))}")
    } else {
        println("Digite o nome de um combústivel válido")
    }
}

fun calculaCombustivel(tipoCombustivel: String, quantidadeLitros: Int): Double {

    return when {
        (tipoCombustivel == "G-gasolina") && (quantidadeLitros <= 20) -> ((4.60) - (4.60 * 0.04)) * quantidadeLitros
        (tipoCombustivel == "G-gasolina") && (quantidadeLitros > 20) -> ((4.60) - (4.60 * 0.06)) * quantidadeLitros
        (tipoCombustivel == "A-alcool") && (quantidadeLitros <= 20) -> ((3.20) - (3.20 * 0.03)) * quantidadeLitros
        else -> ((3.20) - (3.20 * 0.05)) * quantidadeLitros
    }
}