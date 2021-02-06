package basico.exerciciosApostila

fun main() {

    val listaNumeros: MutableList<Int> = mutableListOf()

    println("Digite a quantidade de números: ")
    val quantidade = readLine()!!.toInt()

    for(i in 0 until quantidade) {   // until(até)
        println("Digite o número: ")
        val numero = readLine()!!.toInt()
        listaNumeros.add(numero)
    }
    println(listaNumeros)
    println(mostrarMaiorMedia(listaNumeros))
}

fun mostrarMaiorMedia(listaNumeros: MutableList<Int>): String {

    val valorMaximo = listaNumeros.maxOrNull()  // maior número
    val media = listaNumeros.average()  // média aritmética

    return ("O maior número é: $valorMaximo " +
            '\n'+"A média dos números da lista é: $media")
}