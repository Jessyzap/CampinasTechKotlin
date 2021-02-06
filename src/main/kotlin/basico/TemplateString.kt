package basico

fun main() {

    val nome = "Jéssica"
    val aprovados = listOf("Jose", "Claudia", "Pedro")

    val a: Int = 356.dec()
    val b: String = a.toString()

    println("Int: $a")
    println("Primeiro caractere da String é: ${b.first()}")
    println("Último caractere da String é: ${b.last()}")

    println("Ola $nome, usando Template String")
    println("O primeiro colocado é: ${aprovados[0]}")
}