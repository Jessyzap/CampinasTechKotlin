package basico.ex0602

/*
A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um Programa para coletar dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
a) Média de salário da população
b) Média do número de filhos
c) Maior salário dos habitantes
d) Percentual de pessoas com salário menor que R$ 900,00
Obs.: O final da leituras dos dados se dará com a entrada de um “salário negativo”.
*/

fun main() {

    println(saidaDados(coletaDadosSalario(), coletaDadosFilhos()))
}

fun coletaDadosSalario(): MutableList<Double> {

    val listaSalarios: MutableList<Double> = mutableListOf()

    do {
        print("Digite o salário: ")
        val salario = readLine()!!.toDouble()
        if (salario > 0) listaSalarios.add(salario)
    } while (salario > 0)

    return listaSalarios
}

fun coletaDadosFilhos(): MutableList<Int> {

    val listaFilhos: MutableList<Int> = mutableListOf()

    do {
        print("Digite a quantidade de filhos: ")
        val filhos = readLine()!!.toInt()
        if (filhos > 0) listaFilhos.add(filhos)
    } while (filhos > 0)

    return listaFilhos
}

fun saidaDados(listaSalarios: MutableList<Double>, listaFilhos: MutableList<Int>) {

    var i = 0
    for (salario in listaSalarios) {
        if (salario < 900) i += 1
    }
    val salarioMenor900 = i * 100 / listaSalarios.size

    println()
    println("Média de salário da população: R$${"%.2f".format(listaSalarios.average())}\n" +
            "Média do número de filhos: ${(listaFilhos.average()).toInt()}\n" +
            "Maior salário dos habitantes: R$${listaSalarios.maxOrNull()}\n" +
            "Percentual de pessoas com salário menor que R$ 900,00: $salarioMenor900%")
}
