package basico.ex0402

import java.util.*

/*
A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um programa que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
(considere que o mês possua 4 semanas exatas). use função
*/

fun main() {

    println("Digite o valor por hora: ")
    val valorHora = Scanner(System.`in`).nextDouble()

    println("Digite a quantidade de horas trabalhadas em um mês: ")
    val horasMes= Scanner(System.`in`).nextDouble()

    println(calculoSalario(valorHora,horasMes))
}

fun calculoSalario(valorHora: Double,horasMes: Double){

    val salario = valorHora * horasMes
    val horasSemana = horasMes / 4

    if(horasSemana > 40) calculoHoraExtra(valorHora,horasSemana) // se for maior que 40hrs, calcular o extra

    println("O total de horas trabalhadas no mês é: $horasMes")
    println("O salário por hora é R$: $valorHora")
    if(horasSemana > 40) println("O total do valor extra é R$: ${calculoHoraExtra(valorHora,horasSemana)}")
    println("O salário total é R$: ${salario + calculoHoraExtra(valorHora,horasSemana)}")
}

fun calculoHoraExtra(valorHora: Double,horasSemana: Double): Double {

    val valorHoraExtra = valorHora + valorHora / 2    // acréscimo de 50% na hora trabalhada
    val valorExtra = (((horasSemana - 40) * valorHoraExtra) * 4)    // total Extra

    return valorExtra
}

/*
fun main() {

    println("Digite o seu salário mensal: ")
    val salario = Scanner(System.`in`).nextDouble()

    println("Digite a quantidade de horas trabalhadas em uma semana: ")
    val horasSemana = Scanner(System.`in`).nextDouble()

    println(calculoSalario(salario,horasSemana))
}

fun calculoSalario(salario: Double,horasSemana: Double){

    val horasTrabalhadasMes = horasSemana * 4
    val valorHora = salario / horasTrabalhadasMes

    if(horasSemana > 40) calculoHoraExtra(valorHora,horasSemana) // se for maior que 40hrs, calcular o extra

    println("O total de horas trabalhadas no mês é: $horasTrabalhadasMes")
    println("O salário por hora é R$: $valorHora")
    if(horasSemana > 40) println("O total do valor extra é R$: ${calculoHoraExtra(valorHora,horasSemana)}")
    println("O salário total é R$: ${salario + calculoHoraExtra(valorHora,horasSemana)}")
}

fun calculoHoraExtra(valorHora: Double,horasSemana: Double): Double {

    val valorHoraExtra = valorHora + valorHora / 2    // acréscimo de 50% na hora trabalhada
    val valorExtra = (((horasSemana - 40) * valorHoraExtra) * 4)    // total Extra

    return valorExtra
}
*/
