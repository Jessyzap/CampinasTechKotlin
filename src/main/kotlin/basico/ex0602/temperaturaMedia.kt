package basico.ex0602

/*
Faça um Programa para ler e armazenar em um vetor a temperatura média de todos os dias do ano. Calcular e escrever:
a) Menor temperatura do ano
b) Maior temperatura do ano
c) Temperatura média anual
d) O número de dias no ano em que a temperatura foi inferior a média anual
*/

fun main() {

    println(saidaDadosTemperatura(dadosTemperatura()))

}

fun dadosTemperatura(): MutableList<Double> {

    val listaTemperaturas: MutableList<Double> = mutableListOf()

    var i = 0
    do {
        print("Digite a temperatura do ${i + 1}º dia do ano: ")
        val temperatura = readLine()!!.toDouble()
        listaTemperaturas.add(temperatura)
        i += 1
    } while (listaTemperaturas.size < 365)

    return listaTemperaturas
}

fun saidaDadosTemperatura(listaTemperaturas: MutableList<Double>) {

    var i = 0
    for (temperatura in listaTemperaturas) {
        if (temperatura < listaTemperaturas.average()) i += 1
    }

    println()
    println("Menor temperatura do ano: ${listaTemperaturas.minOrNull()}ºC\n" +
            "Maior temperatura do ano: ${listaTemperaturas.maxOrNull()}ºC\n" +
            "Temperatura média anual: ${listaTemperaturas.average()}ºC\n" +
            "Número de dias do ano em que a temperatura foi inferior a média anual: $i dias\n")
}