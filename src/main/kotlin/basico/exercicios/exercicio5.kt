package basico.exercicios

fun main() {

    val a = 10
    val b = 5

    soma(a,b)
}

fun soma(a: Int, b: Int): Unit {

    val c = ((a + b) * a) / b

    println("A soma / multiplicação e divisão do resultado é: $c")
}

