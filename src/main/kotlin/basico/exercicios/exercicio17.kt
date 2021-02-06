package basico.exercicios

fun main() {

    val numeros: MutableList<String> = mutableListOf()

    for (i in 0..4) {
        println("Digite um número por extenso: ")
        val numero = readLine()
        numeros.add(numero.toString())
    }

    for((indice,numero) in numeros.withIndex()) {
        println("${indice+1} - $numero")
    }
}





