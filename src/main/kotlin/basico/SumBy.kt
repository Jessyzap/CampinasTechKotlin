package basico

fun main() {

    val lista: MutableList<Any> = mutableListOf()

    for (i in 0..2) {

        print("Digite um nome: ")
        val nome = readLine().toString()
        lista.add(nome)

        print("Digite um valor R$ ")
        val valor = readLine()!!.toDouble()
        lista.add(valor)

        print("Digite um número: ")
        val numero = readLine()!!.toInt()
        lista.add(numero)
    }

    println(lista)
    println(lista.sumByDouble { if (it is Double) it.toDouble() else 0.0 })
    println(lista.sumBy { if (it is Int) it.toInt() else 0 })


    /*
    val productsMap = mapOf(
        "abacate" to (10),
        "banana" to (20),
        "caqui" to (30)
    )
    val totalQuantity: Int = productsMap.map { it.value }.sum()
    println(totalQuantity)
    */
}

