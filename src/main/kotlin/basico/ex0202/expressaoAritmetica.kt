package basico.ex0202

// Crie a expressão aritmética (((32/4) * (8*5)) - 30) e troque os números por variáveis

fun main() {

    val (a, b, c, d, e) = listOf (32, 4, 8, 5, 30)

    val f = (((a/b) * (c*d)) - e)
    println(f)
}