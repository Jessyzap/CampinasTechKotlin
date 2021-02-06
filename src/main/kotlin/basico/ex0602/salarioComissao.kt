package basico.ex0602

/*
Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
ultrapassar este valor, calcular e escrever o seu salário total.
*/

fun main() {

    println("Digite o salário: ")
    val salario = readLine()!!.toDouble()

    println("Digite o total de vendas: ")
    val vendas = readLine()!!.toDouble()

    println(calculaComissao(salario, vendas))

}

fun calculaComissao(salario: Double, vendas: Double): String {

    val comissao = if (vendas <= 1500) vendas * 0.03
    else ((vendas - (1500 * 0.05)) + 1500 * 0.03)

    val salarioTotal = salario + comissao

    return ("Salário fixo R$$salario, comissão R$$comissao, total R$$salarioTotal")
}