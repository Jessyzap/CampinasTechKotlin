package basico.ex0602

/*
Faça um programa para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
Use função
*/

fun main() {

    inserirDados()
}

fun inserirDados() {

    println("Digite o número da conta do cliente:")
    val conta = readLine()!!.toInt()
    println("Digite o saldo:")
    val saldo = readLine()!!.toDouble()
    println("Digite o débito:")
    val debito = readLine()!!.toDouble()
    println("Digite o crédito:")
    val credito = readLine()!!.toDouble()

    println(calcularSaldo(conta,saldo, debito, credito))
}

fun calcularSaldo(conta: Int, saldo: Double, debito: Double, credito: Double): String {

    val saldoAtual = ((saldo - debito) + credito)

    val testaSaldo = if (saldoAtual <= 0.0) "Saldo Negativo"
    else "Saldo Positivo"

    return ("Conta: $conta   Saldo atual R$$saldoAtual   Status da conta: $testaSaldo")
}
