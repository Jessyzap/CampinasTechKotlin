package basico

fun main() {

    val compras = listOf("Arroz","Feijao","Carne")
    val comprasMutavel: MutableList<String> = mutableListOf("Arroz","Feijao","Carne")

    println(compras[0])

    comprasMutavel[0] = "Batata"
    comprasMutavel.add("Peixe")
    println(comprasMutavel)

    soma1(3,5)
    soma2(3)

    val c: Double = 5.0
    val d: Double = 3.0

    println("A multiplicação de C e D é: " + multiplicacao(c,d))
    println("A multiplicação de C e D é: " + multiplicacao2(c,d))
}

// função sem retorno
fun soma1(a: Int, b: Int) {
    println("A soma de A e B é: "+ (a+b))
}

// função sem retorno
fun soma2(a: Int, b: Int = 1) {
    println("A soma de A e B é: "+ (a+b))
}

// função com retorno
fun multiplicacao(a: Double, b: Double): Double {
    return a * b
}

// função com retorno
fun multiplicacao2(b: Double, a: Double) = a * b

// função sem retorno
fun multiplicacao3(b: Int, a: Int = 1) : Unit {
    val calculo: Int = a + b
    println(calculo)
}

//fun mostraLista(compras: MutableList<String>): String {}

