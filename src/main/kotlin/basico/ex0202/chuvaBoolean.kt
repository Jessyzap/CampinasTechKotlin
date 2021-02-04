package basico.ex0202

/*
Criar 3 variáveis, chuva, molha, venta. Características de uma tempestade
faça uma validação para que em XOR o valor do print verdadeiro
faça uma validação para que em && seja falso para tempestade
faça uma validação para que em || seja verdadeiro
 */

fun main() {

    val chuva = true
    val molha = true
    var venta = true

    val a = (chuva xor molha xor venta)
    venta = false
    val tempestade = (chuva && molha && venta)
    val c = (chuva || molha || venta)

    println(a)
    println("Tempestade: $tempestade")
    println(c)
}