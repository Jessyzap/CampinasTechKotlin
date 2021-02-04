package basico

fun main() {

    val nome = "Jéssica"
    val aprovados = listOf("Jose", "Claudia", "Pedro")

    var a: Int = 356.dec()
    var b: String = a.toString()

    println("Int: $a")
    println("Primeiro caractere da String é: ${b.first()}")
    println("Último caractere da String é: ${b.last()}")

    println("Ola $nome, usando Template String")
    println("O primeiro colocado é: ${aprovados[0]}")
}