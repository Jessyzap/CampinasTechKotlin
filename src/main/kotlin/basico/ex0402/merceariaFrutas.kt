package basico.ex0402

import java.util.*

/*
 Uma Mercearia está vendendo frutas com a seguinte tabela de preços:

 Morango até 5 KG - R$ 5,50 por Kg
 Acima de 5 KG - R$ 5,20 por Kg

 Maça até 5 KG - R$ 3,80 por Kg
 Acima de 5 KG - R$ 3,50 por Kg

 Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
 receberá ainda um desconto de 10% sobre este total. Escreva um programa
 para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas
 e escreva o valor a ser pago pelo cliente, use função.
 */

fun main() {

    println(layoutMercearia())
    inserePreco()
}

fun layoutMercearia() {

    println()
    println("|================================|    |================================|")
    println("|            MORANGO             |    |              MAÇA              |")
    println("|================================|    |================================|")
    println("| Até 5Kg - R$ 5,50Kg            |    | Até 5Kg - R$ 3,80Kg            |")
    println("| Acima de 5Kg - R$ 5,20Kg       |    | Acima de 5Kg - R$ 3,50Kg       |")
    println("|--------------------------------|    |--------------------------------|")

}

fun inserePreco() {

    println("Digite a quantidade em Kg de morangos: ")
    val qntdMorangos = Scanner(System.`in`).nextInt()

    println("Digite a quantidade em Kg de maçãs: ")
    val qntdMacas = Scanner(System.`in`).nextInt()

    println(calculaPreco(qntdMorangos, qntdMacas))
}

fun calculaPreco(qntdMorangos: Int, qntdMacas: Int) {

    var valorMorango = 0.0
    var valorMaca = 0.0

    when {
        (qntdMorangos <= 5) -> valorMorango = 5.50
        (qntdMorangos > 5) -> valorMorango = 5.20
    }
    when{
        (qntdMacas <= 5) -> valorMaca = 3.80
        (qntdMacas > 5) -> valorMaca = 3.50
    }

    var valorTotalMaca = valorMaca * qntdMacas
    var valorTotalMorango = valorMorango * qntdMorangos

    when {
        (qntdMorangos > 8) -> valorTotalMorango -= (valorTotalMorango * 0.10)
        (valorTotalMorango > 25) -> valorTotalMorango -= (valorTotalMorango * 0.10)
    }
    when {
        (qntdMacas > 8) -> valorTotalMaca -= (valorTotalMaca * 0.10)
        (valorTotalMaca > 25) -> valorTotalMaca -= (valorTotalMaca * 0.10)
    }

    println("O valor total das maçãs é R$$valorTotalMaca")
    println("O valor total dos morangos é R$$valorTotalMorango")
}