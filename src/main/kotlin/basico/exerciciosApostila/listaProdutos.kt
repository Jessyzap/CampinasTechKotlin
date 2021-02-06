package basico.exerciciosApostila

fun main() {

    var i = 0
    val listaPrecos: MutableList<Double> = mutableListOf()
    val listaGeral: MutableList<Any> = mutableListOf()

    while (i < 5) {
        println("Digite o nome do produto: ")
        val produto = readLine().toString()
        listaGeral.add("\nProduto: $produto")

        println("Digite o preço do produto: ")
        val preco= readLine()!!.toDouble()
        listaPrecos.add(preco)
        listaGeral.add("R$$preco")
        i += 1
    }

    println(listaGeral)
    println()
    println(listaPrecos)
    println(mostrarMaiorMedia(listaPrecos))
}

fun mostrarMaiorMedia(listaPrecos: MutableList<Double>): String {

    val valorMaximo = listaPrecos.maxOrNull()
    val media = listaPrecos.average()

    return ("O maior preço é R$$valorMaximo " +
            '\n' + "A média dos preços da lista é R$$media")
}