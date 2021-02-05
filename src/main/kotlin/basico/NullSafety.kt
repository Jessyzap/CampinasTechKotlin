package basico

fun main() {

    val valor: Int? = null
    println(valor?.inc())
    println("Não vai deixar passar...")
    println(valor!!.inc()) // forçar

    val a: Int? = null
    val b: Int? = 2

    val opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor Padrão" // Operador Elvis

    println(a?.dec())
    println(b?.dec())
    println(obrigatorio)
}