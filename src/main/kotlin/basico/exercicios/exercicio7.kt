package basico.exercicios

fun main() {

    val a = 5
    mult()
}

fun mult(a: Int = 3) {

    val b = a * a
    println("O resultado da multiplicação é: $b")

}